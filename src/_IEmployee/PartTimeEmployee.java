package _IEmployee;

import java.util.concurrent.ForkJoinWorkerThread;

public class PartTimeEmployee extends Employee {
    int WorkingHours;

    public PartTimeEmployee(String name, int paymentPerHour,int WorkingHours){
        super(name, paymentPerHour);
        this.WorkingHours = WorkingHours;
    }
    @Override
    public int CalculateSalary() {
        return WorkingHours * getPaymentPerHour();
    }

    @Override
    public String getName() {
        return name;
    }
}