public class Main {

    static void main(String[] args) {
        Employee tim = new Employee("tim","11/11/1992",  "01/01/2020");
        System.out.println(tim);
        System.out.println("Age = " + tim.getAge());
        System.out.println("Pay = " + tim.collectpay());

        SalariedEmployee john = new SalariedEmployee("john", "12/12/1990", "01/01/2019", 50000);
        System.out.println(john);
        System.out.println("john's Paycheck = $" + john.collectpay());

        john.retired();
        System.out.println("john's pension check = $" + john.collectpay());
    }
}