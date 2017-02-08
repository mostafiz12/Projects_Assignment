
public class OOPConcept extends Father {
	public static void main(String[] a)
	{

		// Encapsulation
		
		Bank ban=new Bank();
	    ban.pinNumber(122);
	
	
	// Inheritance	
	Father f=new Father();
	f.eat();
	
	// Polymorphism
	
	Friend ff1=new Brother();
	Friend ff2=new Father();
	
	ff1.eat();
	ff2.eat();

	}	
	
}
// Class for Encapsulation
class Bank
{
int pin=123;

 public void pinNumber(int pinN)
 {
	 if(pin==pinN)
	 {
		 System.out.println("This is authentic pin number");
	 }
	 else
	 {
		 System.out.println("Pin is not correct");
	 }
 }


}



