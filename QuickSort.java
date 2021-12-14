package ArraySorting;

public class QuickSort {

	public static void main(String[] args) {

		int[] a = { 15, 9, 6, 4, 12, 11, 8 };

		int length = a.length;
		QuickSort qs=new QuickSort();
		qs.quickSortRecurssion(a, 0, length-1);
		qs.printArray(a);
	}

	int partition(int[] a, int low, int high) 
	{
		int pivot=a[(low+high)/2];
		
		while(low<=high)
		{
			while(a[low]<pivot)
			{
				low++;
			}
			while(a[high]>pivot)
			{
				high--;
			}
			if(low<=high)
			{
				int temp=a[low];
				a[low]=a[high];
				a[high]=temp;
				
				low++;
				high--;
			}
		}
		return low;
	}
	
	void quickSortRecurssion(int[] a,int low,int high)
	{
		int pi=partition(a, low, high);
		if(low < pi-1)
		{
			//left side
			quickSortRecurssion(a, low, pi-1);
		}
		if(pi < high)
		{
			//right side
			quickSortRecurssion(a, pi, high);
		}
	}
	void printArray(int[] a)
	{
		for(int i:a)
		{
			System.out.println(i+" ");
		}
	}
}
