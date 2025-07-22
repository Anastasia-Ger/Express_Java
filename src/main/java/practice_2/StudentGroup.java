package practice_2;

public class StudentGroup {
    String groupName;
    int studenCount;
    public StudentGroup(String groupName, int studenCount) {
        this.groupName = groupName;
        this.studenCount = studenCount;
    }
    public String getGroupName() {
        return groupName;
    }
    public int getStudentCount() {
        return studenCount;
    }
    public void setGroupName(String newName) {
        groupName = newName;
    }
    public void setStudentCount(int newCount) {
        studenCount = newCount;
    }
    public void printInfo() {
        System.out.println("The name of the group is: " + groupName);
        System.out.println("Student count is: " + studenCount);
    }
}
