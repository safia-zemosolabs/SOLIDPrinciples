package SSM;

import SSM.StudentInfo;

public class FeeCalculator implements FeeInterface {
    private StudentInfo student;

    public FeeCalculator(StudentInfo s){
        this.student = s;
    }

    public long calculateFee(){
        long fee = 20000;
        System.out.println("Fee of " + this.student.getName() + " = Rs. " + fee);
        return 2000;
    }
}
