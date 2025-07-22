package practice_2;

public class Teacher {
    String name;
    String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setSubject(String newSubject) {
        this.subject = newSubject;
    }

    public void printInfo() {
        System.out.println("Teacher's name is: " + name);
        System.out.println(name + " teaches " + subject);
    }
}
