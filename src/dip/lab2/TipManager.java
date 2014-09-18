
package dip.lab2;

/**
 *
 * @author justinpotts
 */

public class TipManager {
    
     private CalculatorStrat tipCalc;
        
        public TipManager(CalculatorStrat tipCalc) {
        this.tipCalc = tipCalc;
        }
        
        public double getTip() {
            System.out.println("You should tip " + tipCalc.getTip());
            return tipCalc.getTip();
        }
        
        public CalculatorStrat getTipCalc() {
        return tipCalc;
        }
        
        public void setTipCalc(CalculatorStrat tipCalc) {
        this.tipCalc = tipCalc;
    }
}
 


