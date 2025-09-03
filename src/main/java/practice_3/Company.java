package practice_3;

public class Company {
    public static String companyName = "Apple";
    public final int employeeID;
    private String employeeName;

    public Company(int employeeID, String employeeName) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
    }


    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    public static void printCompanyName(){
        System.out.println("Company name is: " + companyName);
    }
}
