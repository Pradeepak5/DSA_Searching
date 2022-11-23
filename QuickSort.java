import java.util.Scanner;
public class QuickSort {
	
	public void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public int partition(int[] arr,int low,int high) {
		int pivot=arr[high];
		int i=low;
		int j=low;
		while(i<=high) {
			if(arr[i]<=pivot) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				j++;
			}
			i++;
		}
		return j-1;
	}
	
	public void sort(int[] arr,int low,int high) {
		if(low<high) {
			int p=partition(arr,low,high);
			sort(arr,low,p-1);
			sort(arr,p+1,high);
		}
	}
	
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		QuickSort q=new QuickSort();
		System.out.println("Enter the size of Array : ");
		int arrSize=s.nextInt();
		int[] arr=new int[arrSize];
		for(int i=0;i<arrSize;i++) {
			System.out.println("Enter "+(i+1)+" element : ");
			arr[i]=s.nextInt();
		}
		System.out.println("Array before sorting : ");
		q.printArray(arr);
		System.out.println("Array after Quick sort : ");
		q.sort(arr, 0, arrSize-1);
		q.printArray(arr);
	}
}
