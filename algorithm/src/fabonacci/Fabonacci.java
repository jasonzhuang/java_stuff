package fabonacci;

import java.math.BigInteger;

public class Fabonacci {
public static BigInteger fabonacci(int n)
{
	BigInteger[] a=new BigInteger[n];
	a[1]=new BigInteger("1");
	a[2]=new BigInteger("1");
	for(int i=3;i<n;i++)
	{

		a[i]=new BigInteger("a[i-1]").add(new BigInteger("a[i-2]"));
	}
	return a[n-1];
	
}
public static void main(String[] args) {
	System.out.println(fabonacci(10));
}
}
