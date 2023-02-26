package _IEmployee;

public class TestEmployee {
    public static void main(String[] args){
        IEmployee p1 = new PartTimeEmployee("thit",800,8);
        IEmployee f1 = new FullTimeEmployee("jonh kenady",1000);
        IEmployee[] list = {p1,f1};
        for(IEmployee s: list){
            System.out.println("Name = "+s.getName()+"  Salary = "+s.CalculateSalary());
        }

    }
}
