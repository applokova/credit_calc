package src;

import src.CreditPaymentService;

public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int a = service.calculate(1000000, 9.99, 1);
        int b = service.calculate(1000000, 9.99, 2);
        int c = service.calculate(1000000, 9.99, 3);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}