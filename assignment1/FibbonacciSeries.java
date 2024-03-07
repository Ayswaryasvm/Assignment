package assignment1;

public class FibbonacciSeries {
	public static void main(String[] args) {
		int n=8;
		int a=0;
		int b=1;
		int c=0;
		System.out.println("fibbanocci series are:" );
		System.out.println(a);
		System.out.println(b);
		for (int i=0;i<n;i++) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			
		}
		
	}
	
}
