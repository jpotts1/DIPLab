package dip.lab1;

/**
 * A simple implementation sub-class of Employee. These are low-level classes
 * in the DIP. Does it meet the rules of DIP? If not fix it.
 *
 * @author your name goes here
 */

    public final class SalariedEmployee implements Employee {
        private double annualSalary;
        private double annualBonus;
        
    public SalariedEmployee(double annualSalary, double annualBonus) {
        setAnnualSalary(annualSalary);
        setAnnualBonus(annualBonus);
    }
    
       
    public double getAnnualWages() {
    return annualSalary + annualBonus;
    }
    
    public double getAnnualSalary() {
    return annualSalary;
    }
    
    public void setAnnualSalary(double annualSalary) {
    this.annualSalary = annualSalary;
    }
    
    public double getAnnualBonus() {
    return annualBonus;
    }
    
    public void setAnnualBonus(double annualBonus) {
    this.annualBonus = annualBonus;
    }
}

