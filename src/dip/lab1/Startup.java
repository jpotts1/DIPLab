package dip.lab1;

import java.text.NumberFormat;

/**
 * Just a start and test class for this program. You may modify this class
 * in any way you see fit.
 *
 * @author jlombardo
 */
public class Startup {
    
 public static void main(String[] args) {
     
    Employee employee2 = new SalariedEmployee(75000, 3500);
    Employee employee1 = new HourlyEmployee(10, 1750);
    HRService hr = new HRService();
    
    System.out.println("Employee 1 compensation " + hr.getAnnualCompensationForEmployee(employee1));
    System.out.println("Employee 2 compensation: " + hr.getAnnualCompensationForEmployee(employee2));
}
}

