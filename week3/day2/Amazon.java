package week3.day2;

public class Amazon extends  CanaraBank {
	@Override
	public void cashOnDelivery() {
		// TODO Auto-generated method stub
		System.out.println("Cash on delivery");
	}

	@Override
	public void upiPayments() {
		// TODO Auto-generated method stub
		System.out.println("upi payments");
	}

	@Override
	public void cardPayments() {
		// TODO Auto-generated method stub
		System.out.println("card payments");
	}

	@Override
	public void internetBanking() {
		// TODO Auto-generated method stub
		System.out.println("internet banking");
	}

	@Override
	public void recordPaymentDetails() {
		// TODO Auto-generated method stub
		System.out.println("record payment details");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Amazon obj=new Amazon();
		 obj.cardPayments();
		 obj.cashOnDelivery();
		 obj.internetBanking();
		 obj.recordPaymentDetails();
		 obj.upiPayments();
	}

	

}
