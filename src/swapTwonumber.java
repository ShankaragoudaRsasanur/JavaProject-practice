
public class swapTwonumber {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println("before swapping;");
		System.out.println("a =" +a);
		System.out.println("b =" +b);
		if(a!=b) {
			a = a + b;
			b = a - b;
			a = a - b;
			
		}
		System.out.println("after swaffing;");
		System.out.println("b =" + b);
		System.out.println("a = " + a );
		
	}

}
