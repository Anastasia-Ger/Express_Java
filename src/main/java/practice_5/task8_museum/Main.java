package practice_5.task8_museum;

public class Main {
    public static void main(String[] args) {
        Museum museum = new Museum();
        Sculpture sculpture = new Sculpture();
        Manuscript manuscript = new Manuscript();
        museum.showExhibit(sculpture);
        museum.showExhibit(manuscript);
        museum.preserveExhibit(sculpture);
        museum.preserveExhibit(manuscript);
    }
}
