import SEM.*;
import STM.*;
import SSM.*;

public class SmartUniversityAppMain {
    public static void main(String args[]){
        System.out.println("\nDemo violating the SOLID Principles\n");

        /*************************************
         *    Smart Student Management
         *
         *    Demonstrating SRP and OCP Rules
         *************************************/
        SmartStudentManager ssmObj = new SmartStudentManager();

        ssmObj.handler();

        /*************************************
         *    Smart Transportation
         *
         *    Demonstrating LSP and ISP Rules
         *************************************/
        SmartTransportManager stmObj = new SmartTransportManager();

        stmObj.handler();


        /*************************************
         *    Smart Electrical Automation
         *
         *        Demonstrating DIP Rule
         *************************************/
        SmartElectricalManager semObj = new SmartElectricalManager();

        semObj.handler();
    }
}
