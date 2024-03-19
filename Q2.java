
public class Q2 {
	public static void main(String[] args) {
		try {
			int a[] = new int[7];
			System.out.println(a[9]);
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage()+ " ocured please check your code");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Index should be in the range of 0 to size of array");
		}catch(IllegalArgumentException e) {
		}finally {
			System.out.println("sorry for the incovenes");
		}
		System.out.println("Very important code");
		System.out.println("need to run");
	}

}
