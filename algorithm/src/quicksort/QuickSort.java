package quicksort;
class Quick
{
	public static int pivotIndex(int[]a ,int first,int last)
	{
		int mid,scanUp,scanDown;
		int pivot,temp;
		if(first==last)
			return last;
		else if(first==last-1)
			return first;
		else{
			mid=(first+last)/2;
			pivot=a[mid];
			a[mid]=a[first];
			a[first]=pivot;
			scanUp=first+1;
			scanDown=last-1;
			while(true)
			{
				while(scanUp<=scanDown&&a[scanUp]<pivot)
					scanUp++;
				while(pivot<a[scanDown])
					scanDown++;
				if(scanUp>=scanDown)
					break;
				temp=a[scanDown];
				a[scanUp]=a[scanDown];
				a[scanDown]=temp;
				scanUp++;
				scanDown--;
			}
			a[first]=a[scanDown];
			a[scanDown]=pivot;
			return scanDown;
		}
	}
	   public static void quickSort(int[]a,int first,int last)
	   {
		   int pivotLoc;
		   int temp;
		   if(last-first<=1) return;
		   else if(last-first==2)
		   {
			   if(a[last-1]<a[first])
			   {
				   temp=a[last-1];
				   a[last-1]=a[first];
				   a[first]=temp;
			   }
			   return;
		   }
		   else
		   {  pivotLoc=pivotIndex(a,first,last);
		      quickSort(a,first,pivotLoc);
		      quickSort(a, pivotLoc+1,last);
		    }
	   }
}
public class QuickSort {
	
	public static void main(String[] args) {
		int[]a={15,79,56,2,13,45};
		Quick.quickSort(a, 0,6);
		System.out.println(a);

	}

}
