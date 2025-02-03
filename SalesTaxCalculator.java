public class SalesTaxCalculator {
    public static void main(String[] args) {
        String name = args[0];
        System.out.println(name);
        State state;
        if(name.equals("Alaska")){
            state = new Alaska();
            state.setBehavior(new NoTax());
        }
        else if(name.equals("Indiana")){
            state = new Indiana();
            state.setBehavior(new SevenPercent());
        }
        else if(name.equals("Hawaii")){
            state = new Hawaii();
            state.setBehavior(new FourPointFivePercent());
        }
        else{
            return;
        }
        int sale = Integer.valueOf(args[1]);
        state.showTax(sale);
    }
}
