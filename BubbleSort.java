package ArraySorting;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] a= {5,80,6,42,56,1};
		
		int temp;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}

	}

}
