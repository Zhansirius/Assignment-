public class Residence {
    private String officeName;
    private String city;
    public Residence(String officeName, String city) {
        this.officeName = officeName;
        this.city = city;
    }
    public String getOfficeName() {
        return officeName;
    }
    public void setOfficeName(String officeName) {
        this.officeName = officeName;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void display() {
        System.out.println("Office: " + officeName + ", City: " + city);
    }
}