package practice_5.task8_museum;

public class Manuscript extends Exhibit{
    private static final  String DESCRIPTION = "Manuscript is a historical handwritten document.";
    @Override
    public void describe() {
        System.out.println(DESCRIPTION);
    }
    @Override
    public void preserve() {
        System.out.println("Manuscript requires controlled humidity.");
    }
}
