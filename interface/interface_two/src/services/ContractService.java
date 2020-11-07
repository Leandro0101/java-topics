package services;

import java.util.Calendar;
import java.util.Date;

import entities.Contract;
import entities.Installment;

public class ContractService {
	private OnlinePaymentService onlinePaymentService;

	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}

	public void processContract(Contract contract, int months) {
		double initialMonthlyValue = contract.getTotalValue() / months;

		double monthlyValue = initialMonthlyValue;
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(contract.getDate());

		for (int i = 1; i <= months; i++) {
			monthlyValue = initialMonthlyValue + onlinePaymentService.interest(initialMonthlyValue, i);
			monthlyValue += onlinePaymentService.paymentFee(monthlyValue);

			contract.getInstallments().add(new Installment(generateDueDate(contract.getDate(), i), monthlyValue));
		}
	}

	public Date generateDueDate(Date date, int N) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.MONTH, N);

		return calendar.getTime();
	}
}
