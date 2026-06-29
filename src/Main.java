public class Main {

    static void main(String[] args) {
        Employee tim = new Employee("tim","11/11/1992",  "01/01/2020");
        System.out.println(tim);
        System.out.println("Age = " + tim.getAge());
        System.out.println("Pay = " + tim.collectpay());
    }
}