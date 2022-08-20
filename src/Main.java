package src;

import src.CreditPaymentService;

public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int resulOne = service.calculate(1000000, 9.99, 1);
        int resultTwo = service.calculate(1000000, 9.99, 2);
        int resultThree = service.calculate(1000000, 9.99, 3);
        System.out.println(resulOne);
        System.out.println(resultTwo);
        System.out.println(resultThree);
    }
}