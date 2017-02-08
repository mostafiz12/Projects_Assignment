
/* 1. In abstract class there may be concrete/normal methods but in Interface its 100% abstract, there is no concrete/normal methods. 
 * 
 */

public class Interfaceademo implements Bank {
	
 public int taka()
 {
	 return 1000;
 }
 public static void main(String [] ar)
 {
	 Interfaceademo tnte= new Interfaceademo();
	 tnte.withdraw();
	 tnte.deposite();
	 System.out.println(tnte.taka());
 }
 
 public void withdraw()
 {
	 System.out.println("Money withdrawing...");
 }
 
 public void deposite()
 {
	 System.out.println("Money depositing...");
 }
 
}