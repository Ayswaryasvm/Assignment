package assignment1;

public class Palindrome {
	public static void main(String[] args) {
		
		int n=12321;
		int s=0;
	   
	    for(int i=n;i>0; )
	    {
	    	int r=i%10;
	        s=s*10+r;
	        i=i/10;
	    }
	     
	    if(s==n)
	    {
	        System.out.println(n  +" is a Palindrome Number"); 
	    }
	    else
	    {
	    	System.out.println(n  +" is a not Palindrome Number"); 
	    }
		
	}

}
