
public class Exception_handling {
	public static void main(String[] args) {
 	try {
			int a = 5;
		     int b= 0;
		
		
		int c = a/b;
		System.out.println(c);
	}catch(ArithmeticException e){
		System.out.println(e.getMessage()+ " occured please check your code");
		
		System.out.println("Very Important code");
		System.out.println("Need to run");
		
	}
	}
}



