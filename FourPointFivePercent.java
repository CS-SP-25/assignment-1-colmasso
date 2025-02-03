public class FourPointFivePercent implements SalesTaxBehavior{
    @Override
    public double compute(double value) {
        return 0.045 * value;
    }
}