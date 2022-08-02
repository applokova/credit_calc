package src;

public class CreditPaymentService {
    public int calculate(double sum, double bid, int per) {
        int result;
        if (per >= 1) {
            int months = (per * 12);
            double xBids = bid / 100 / 12;
            double pow = Math.pow(1 + xBids,months);
            double edd = (sum * ( xBids + (xBids / ( pow - 1 ) ) ));
            result = (int) edd;
        } else {
            result = 0;
        }
        return result;
    }
}
