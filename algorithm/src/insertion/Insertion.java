package insertion;

public class Insertion {
public static void main(String[] args) {
	int[] a={5,18,6,79,33};
	Algo algo=new Algo();
	algo.insertionSort(a);
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
	
}
}
class Algo
{
	public void insertionSort(int[] a)
	{
		int i,j,target;
		for(i=1;i<a.length;i++)
		{
			j=i;
			target=a[i];
			while(j>0&&target<a[j-1])
			{
				a[j]=a[j-1];
				j--;		
			}
			a[j]=target;
		}
	}
}
