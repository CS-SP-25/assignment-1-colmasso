public class State{

    private String name;
    SalesTaxBehavior behavior;

    public State(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setBehavior(SalesTaxBehavior behavior){
        this.behavior = behavior;
    }

    public void showTax(double value){
        System.out.printf("The sales tax on $%.2f in %s is $%.2f\n", value, getName(), behavior.compute(value));
    }
}