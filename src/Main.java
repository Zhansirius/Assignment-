public class Main {
    public static void main(String[] args) {
        Residence office1 = new Residence("GCS Games", "Ukraine");
        Residence office2 = new Residence("Valve", "America");
        Creator creator1 = new Creator("Oleg", "Game Designer", 5, office1);
        Creator creator2 = new Creator("Gabe Newel", "Programmer", 7, office2);
        Project game1 = new Project("S.T.A.L.K.E.R", "FPS", creator1);
        Project game2 = new Project("Half-life", "FPS", creator2);
        game1.display();
        System.out.println();
        game2.display();
        System.out.println();
    }
}