package dip.lab2;

/**
 * An example low-level class. Does this class definition follow the DIP?
 * If not, fix it.
 *
 * Any other best practice violations? Fix them too.
 *
 * @author your name goes here
 */
public class FoodServiceTipCalculator implements CalculatorStrat{
    private static final double MIN_BILLTOTAL = 0.00;
    private static final String BILLTOTAL_ENTRY_ERR =
    "Error: bill must be greater than or equal to " + MIN_BILLTOTAL;
    private static final double GREAT_RATE = 0.30;
    private static final double GOOD_RATE = 0.20;
    private static final double MEDICORE_RATE = 0.15;
    private static final double POOR_RATE = 0.10;
    
    private double billTotal;
        
//    public enum dip.lab2.QualityOfService {
//        GREAT, GOOD, MEDICORE, POOR
//    }
    
    private QualityOfService QualityOfService;

    public FoodServiceTipCalculator(QualityOfService q, double billTotalAmt) {
        this.setServiceRating(q);
        this.setBillTotal(billTotalAmt);
    }

    
    @Override
    public double getTip() {
        double tip = 0.00; // always initialize local variables
        
        switch(QualityOfService) {
            case GREAT:
                tip = billTotal * GREAT_RATE;
                break;
            case GOOD:
                tip = billTotal * GOOD_RATE;
                break;
            case MEDICORE:
                tip = billTotal * MEDICORE_RATE;
                break;
            case POOR:
                tip = billTotal * POOR_RATE;
                break;
        }

        return tip;
    }

    public final void setBillTotal(double billTotalAmt) {
        if(billTotalAmt < MIN_BILLTOTAL) {
            throw new IllegalArgumentException(BILLTOTAL_ENTRY_ERR);
        }
        billTotal = billTotalAmt;
    }

    public final void setServiceRating(QualityOfService q) {
        // No need to validate because enums provide type safety!
        QualityOfService = q;
    }

    public QualityOfService getQualityOfService() {
        return QualityOfService;
    }


}
