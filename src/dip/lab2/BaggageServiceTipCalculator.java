package dip.lab2;

/**
 * An example low-level class. Does this class definition follow the DIP?
 * If not, fix it.
 *
 * Any other best practice violations? Fix them too.
 *
 * @author your name goes here
 */
public class BaggageServiceTipCalculator implements CalculatorStrat {
    private static final double MIN_BILLTOTAL = 0.00;
    private static final double MAX_BILLTOTAL = 100.00;
    private static final String BILLTOTAL_ENTRY_ERR =
            "Error: bill must be between " + MIN_BILLTOTAL + " and "
            + MAX_BILLTOTAL;
    private static final double GREAT_RATE = 0.30;
    private static final double GOOD_RATE = 0.20;
    private static final double MEDIOCRE_RATE = 0.15;
    private static final double POOR_RATE = 0.10;

    private double baseTipPerBag;
    private int bagCount;

    @Override
    public double getTip() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    private QualityOfService QualityOfService;

    public BaggageServiceTipCalculator(QualityOfService q, int bags) {
        this.setServiceRating(q); // perform validation
        this.setBagCount(bags);

        baseTipPerBag = 1.00; // set default value
    }

    public double getTipForBaggeHandler() {
        double tip = 0.00; // always initialize local variables

        
        switch(QualityOfService) {
        case GREAT:
        tip = baseTipPerBag * bagCount * (1 + GOOD_RATE);
        break;
        case GOOD:
        tip = baseTipPerBag * bagCount * (1 + GOOD_RATE);
        break;
        case MEDICORE:
        tip = baseTipPerBag * bagCount * (1 + MEDIOCRE_RATE);
        break;
        case POOR:
        tip = baseTipPerBag * bagCount * (1 + POOR_RATE);
        break;
        }

        return tip;
    }

    public final void setServiceRating(QualityOfService q) {
        // No need to validate because enums provide type safety!
        QualityOfService = q;
    }

    public QualityOfService getQualityOfService() {
        return QualityOfService;
    }

    public int getBagCount() {
        return bagCount;
    }

    public final void setBagCount(int bagCount) {
        if(bagCount < 0) {
            throw new IllegalArgumentException(
                    "bag count must be greater than or equal to zero");
        }
        this.bagCount = bagCount;
    }

    public double getBaseTipPerBag() {
        return baseTipPerBag;
    }
    
    public void setBaseTipPerBag(double baseTipPerBag) {
        if(baseTipPerBag < 0) {
            throw new IllegalArgumentException(
                    "error: base tip must be greater than or equal to zero");
        }
        this.baseTipPerBag = baseTipPerBag;
    }

}
