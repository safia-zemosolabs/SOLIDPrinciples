package SSM;

import SSM.StudentInfo;

public class PerformanceCalculator implements PerformanceInterface {
    StudentInfo student;

    public PerformanceCalculator(StudentInfo s){
        this.student = s;
    }

    public String reportPerformance(){
        String performance = "99%";
        System.out.println("Performance of " + this.student.getName() + " = " + performance);
        return performance;
    }
}
