package practice_5.task8_museum;

public class Sculpture extends Exhibit{
    private static final String DESCRIPTION = "A sculpture is a three-dimensional artwork.";
    @Override
    public void describe() {
        System.out.println(DESCRIPTION);
    }
    @Override
    public void preserve() {
        System.out.println("Sculpture needs restoration.");
    }
}
