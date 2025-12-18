public class Creator {
    private String name;
    private String role;
    private int experience;
    private Residence residence;

    public Creator(String name, String role, int experience, Residence residence) {
        this.name = name;
        this.role = role;
        this.experience = experience;
        this.residence = residence;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public int getExperience() {
        return experience;
    }
    public void setExperience(int experience) {
        this.experience = experience;
    }
    public Residence getResidence() {
        return residence;
    }
    public void setResidence(Residence residence) {
        this.residence = residence;
    }
    public void display() {
        System.out.println("Creator: " + name + ", Role: " + role +
                ", Experience: " + experience + " years");
        residence.display();
    }
}