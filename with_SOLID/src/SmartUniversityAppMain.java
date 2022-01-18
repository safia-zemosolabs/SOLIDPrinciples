import SEM.*;
import SSM.*;
import STM.*;


public class SmartUniversityAppMain {
    public static void main(String args[]){
        System.out.println("\nDemo Following the SOLID Principles\n");

        /*************************************
         *    Smart Student Management (SSM)
         *
         *    Demonstrating SRP and OCP Rules
         *************************************/
        SmartStudentManager ssmObj = new SmartStudentManager();

        ssmObj.handler();

        /*************************************
         *    Smart Transport Management (STM)
         *
         *    Demonstrating LSP and ISP Rules
         *************************************/
        SmartTransportManager stmObj = new SmartTransportManager();

        stmObj.handler();

        /*************************************
         *    Smart Electrical Management (SEM)
         *
         *    Demonstrating DIP Rule
         *************************************/
        SmartElectricalManager semObj = new SmartElectricalManager();

        semObj.handler();

    }
}
