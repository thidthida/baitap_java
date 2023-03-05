package Pizza;

public class PizzaClient {
    public void run(){
        Pizza round = new Pizza(99.3, new Circle(2.5));
        Pizza rect = new Pizza(99.4, new Rectangle(6,4));
        PizzaDeal pd = new PizzaDeal();
        System.out.println(round+"is a better deal than"+rect+":"+pd.betterDeal(round,rect));
    }
    public static void main(String[] args){
        new PizzaClient().run();
    }
}
