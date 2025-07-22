package week3.day2;
//Create an Interface Payments with the following abstract methods:
//	 - cashOnDelivery()
//	 - upiPayments()
//	 - cardPayments()
//	 - internetBanking()
//	Create an Abstract Class CanaraBank that implements Payments interface and adds `recordPaymentDetails()` for
//	payment specifics.
//	Create a Concrete Class Amazon that inherits CanaraBank, implementing methods.
public abstract class CanaraBank implements Payments
{
public abstract void recordPaymentDetails();
	
}
