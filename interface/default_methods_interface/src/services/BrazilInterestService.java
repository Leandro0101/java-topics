package services;

public class BrazilInterestService implements InterestService {

	private double interestRate;
	
	public BrazilInterestService() {
	}
	
	public BrazilInterestService(double interestRate) {
		this.interestRate = interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public double getInterestRate() {
		return interestRate;
	}

}
