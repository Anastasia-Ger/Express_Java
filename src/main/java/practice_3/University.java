package practice_3;

public class University {
    public static String universityName = "MIT";
    final int studentID;
    String studentName;

    public University(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }
    public static void changeUniversityName(String newName) {
        universityName = newName;
    }

    public String getStudentName() {
        return studentName;
    }
    public void printStudentInfo() {
        String result = String.format("Student Name: %s, Student ID: %s, University Name: %s",
                studentName, studentID, universityName);
        System.out.println(result);
    }

}
