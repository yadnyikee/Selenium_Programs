package ExceptionHandling;

public class ExceptionHandling3 {

	public static void main(String[] args) {
		String name=null;
		
		try {
			System.out.println("step1");
			System.out.println(name.length());
		} catch (ArithmeticException a) {//in above line exception is NullPointerException and we are writing
			                              //arithamatic exception so this catch block will not execute
		
			System.out.println(a.getMessage());
			a.printStackTrace();
			System.out.println("heloo");
		}
//		catch (NullPointerException n) {
//			System.out.println(n.getMessage());
//			n.printStackTrace();
//			System.out.println("block executed");
//		}
		catch (Exception n) {
			System.out.println(n.getMessage());
			n.printStackTrace();
			System.out.println("block executed");
			
			
			
		
			
			
		}

	}

}
