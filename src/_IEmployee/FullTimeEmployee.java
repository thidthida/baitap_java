package _IEmployee;

public class FullTimeEmployee extends Employee {
    public FullTimeEmployee(String name, int paymentPerHour){
        super(name, paymentPerHour);
    }
    @Override
    public int CalculateSalary() {
        return 8*getPaymentPerHour();
    }

    @Override
    public String getName() {
        return name;
    }
}
