package assignment1;

public class PrimeNumber {
	public static void main(String[] args) {
		int n=11;
		int a=0;
		for (int i=1;i<=n;i++) {
		 
			if (n%i==0) {
				a++;
			} 
		}
		if (a==2) {
			System.out.println(n  + " is a Prime Number");
		}
		else {
			System.out.println(n  + " is not a Prime Number");
		}
	}
}


