package SSM;

public class SmartStudentManager {
    public void handler() {
        System.out.println("\nSSM Handler Started Running ...");

        StudentInfo studentInfoObj = new StudentInfo();
        studentInfoObj.setName("Omer");
        studentInfoObj.setAge(10);

        FeeCalculator feeCalculatorObj = new FeeCalculator(studentInfoObj);
        feeCalculatorObj.calculateFee();

        AttendanceCalculator attendanceCalculatorObj = new AttendanceCalculator(studentInfoObj);
        attendanceCalculatorObj.reportAttendance();

        //Using New Functionality following OCP Rule
        PerformanceCalculator performanceCalculatorObj = new PerformanceCalculator(studentInfoObj);
        performanceCalculatorObj.reportPerformance();
    }
}
