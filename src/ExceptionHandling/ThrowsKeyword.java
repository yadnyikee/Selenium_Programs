package ExceptionHandling;

import org.openqa.selenium.support.FindBy;

public class ThrowsKeyword {

	public static void main(String[] args) {
		//ThrowsKeyword is used to declared the execption

		ThrowsKeyword TK=new ThrowsKeyword();
		try {
			TK.div();
		} catch (Exception e) {
			//System.out.println("jai mata diiii");
			e.printStackTrace();
		}
		
		System.out.println("hiii");
	}
	public void sum() {
		try {
			
			div();
			
		} catch (ArithmeticException e) {
			
		}
	}

	public void div() {
		
		int i=10/0;
		System.out.println("jai mata diiii");
	}
}
//throws ArithmeticException,NullPointerException