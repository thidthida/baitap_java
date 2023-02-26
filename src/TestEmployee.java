import _IEmployee.Employee;
import _IEmployee.PartTimeEmployee;

public class TestEmployee {
    public static void main(String[] args){
        Employee e1 = new PartTimeEmployee("thit",1000000,8);
        System.out.println(e1.CalculateSalary());
    }
}
