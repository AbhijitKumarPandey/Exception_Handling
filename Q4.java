
public class Q4 {
	public static void main(String[] args) {
		System.out.println(1);
		try {
			System.out.println(11);
			int c =6/0;
			System.out.println(2);
		}catch(Exception e) {
			System.out.println(3);
			int c= 6/0;
			System.out.println("In Catch");
			System.out.println(4);
		}
		System.out.println(5);
	}

}
