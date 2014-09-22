package dip.lab1;

/**
 * An implementation sub-class of an Employee. These are low-level classes
 * in the DIP. Does it meet the rules of DIP? If not fix it.
 *
 * @author your name goes here
 */
// overide statements

    public final class HourlyEmployee implements Employee {
        private double hourlyRate;
        private double totalHrsForYear;
        private double hrsYear;
        
    public HourlyEmployee(double hourlyRate, double totalHrsForYear) {
        setHourlyRate(hourlyRate);
        setTotalHrsForYear(totalHrsForYear);
}
    @Override
        public double getAnnualWages() {
        return hourlyRate * totalHrsForYear;
    }
    public double getHourlyRate() {
        return hourlyRate;
    }
    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
    public double getTotalHrsForYear() {
        return totalHrsForYear;
    }
    public double getHrsYear (){
        return hrsYear;
    }
    public void setTotalHrsForYear(double totalHrsForYear) {
        this.totalHrsForYear = totalHrsForYear;
}
}
