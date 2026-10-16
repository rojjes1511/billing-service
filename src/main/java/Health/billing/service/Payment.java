package Health.billing.service;

public class Payment {
	public int calculatePayment(int amount, String type, int discount) {
		int finalAmount = 0;
		switch (type) {

		case "REGULAR":
			finalAmount = amount - (amount * discount) / 100;
			break;

		case "GOLD":
			finalAmount = amount - (amount * discount) / 100 - 100;
			break;
			
		case "PLATINUM":
			finalAmount = amount - (amount * discount) / 100 - 200;
			break;

		default:
			finalAmount = amount;
		}

		return finalAmount;

	}

}
