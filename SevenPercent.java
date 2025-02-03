public class SevenPercent implements SalesTaxBehavior{
    @Override
    public double compute(double value) {
        return 0.07 * value;
    }
}