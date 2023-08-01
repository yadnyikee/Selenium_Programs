package ExceptionHandling;

public class ExeceptionHandling2 {
	
	public static void main(String[] args) {
		
		System.out.println("hello");
		
		int num=100;
		
		try {
			System.out.println(num/0);
		}
		catch(ArithmeticException a){
			
			System.out.println("gud morning");
			System.out.println(a.getMessage());
			a.printStackTrace();
		}
		finally {
			System.out.println("run any way");
		}
		System.out.println("gud afternoon");
		int arr[]=new int[5];
		
		try {
			System.out.println(arr[5]=88);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.out.println("gud morning");
		}
		
		
		
		
	}

}
