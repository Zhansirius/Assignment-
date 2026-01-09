import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
public class CreatorDAO {
    public static void save(Creator creator) {
        String sql = """
            INSERT INTO creators(name, role, experience, age)
            VALUES (?, ?, ?, ?)
            """;
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, creator.getName());
            ps.setString(2, creator.getRole());
            ps.setInt(3, creator.getExperience());
            ps.setInt(4, creator.getAge());

            ps.executeUpdate();
            System.out.println("Creator saved to DB");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void showAll() {
        String sql = "SELECT * FROM creators";
        try (Connection conn = DBConnection.getConnection();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println(
                        rs.getInt("creator_id") + " | " +
                                rs.getString("name") + " | " +
                                rs.getString("role") + " | " +
                                rs.getInt("experience") + " years"
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

