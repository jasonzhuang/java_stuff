package reverse;

import com.sun.net.ssl.SSLContext;

public class Reverse {

	public static void main(String[] args) {
	    char[] s={'a','b','c','d','e','f'};
	    reverse(s);
        for(int i=0;i<s.length;i++)
        {
        	System.out.println(s[i]);
        }
	

	}
	public static void reverse(char[] value)
	{
		int n=value.length-1;
		for (int j = (n-1) >> 1; j >= 0; --j) {
		    char temp = value[j];
		    char temp2 = value[n - j];
		    
		    value[j] = temp2;
		    value[n - j] = temp;
		}
	}
}
