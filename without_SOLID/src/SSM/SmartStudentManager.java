package SSM;

public class SmartStudentManager {
    public void handler() {
        System.out.println("\nSSM Handler Started Running ...");

        StudentInfo studentInfoObj = new StudentInfo();
        studentInfoObj.setName("Omer");
        studentInfoObj.setAge(10);

        studentInfoObj.calculateFee();
        studentInfoObj.reportAttendance();

        //Using New Functionality Violating OCP Rule
        studentInfoObj.reportPerformance();
    }
}
