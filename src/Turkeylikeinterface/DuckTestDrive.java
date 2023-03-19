package Turkeylikeinterface;

public class DuckTestDrive {
    public static void main(String[] args) {
        Duck Mallard = new MallardDuck();
        System.out.println(Mallard);
        Duck Red = new RedheadDuck();
        System.out.println(Red);
        Duck Rub = new RedheadDuck();
        System.out.println(Rub);
        Duck Decoy = new DecoyDuck();
        System.out.println(Decoy);
    }
}