package services;

public class PaypalService implements OnlinePaymentService {
	
	private final double PAYMENT_FEE = 0.02;
	private final double ONTHLY_INTEREST = 0.01; 

	@Override
	public double interest(double amount, int months) {
		return amount * ONTHLY_INTEREST * months;
	}

	@Override
	public double paymentFee(double amount) {
		return amount * PAYMENT_FEE;
	}

}
