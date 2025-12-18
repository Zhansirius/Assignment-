public class Project {
    private String gameName;
    private String genre;
    private Creator creator;
    public Project(String gameName, String genre, Creator creator) {
        this.gameName = gameName;
        this.genre = genre;
        this.creator = creator;
    }
    public String getGameName() {
        return gameName;
    }
    public void setGameName(String gameName) {
        this.gameName = gameName;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public Creator getCreator() {
        return creator;
    }
    public void setCreator(Creator creator) {
        this.creator = creator;
    }
    public void display() {
        System.out.println("Game: " + gameName + ", Genre: " + genre);
        creator.display();
    }
}