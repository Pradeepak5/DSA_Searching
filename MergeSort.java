import java.util.Scanner;
public class MergeSort {
	
	public void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public void sort(int[] arr, int[] temp, int low, int high) {
		if(low<high) {
			int mid=low+((high-low)/2);
			sort(arr,temp,low,mid);
			sort(arr,temp,mid+1,high);
			merge(arr,temp,low,mid,high);
		}
	}
	
	private void merge(int[] arr, int[] temp, int low, int mid, int high) {
		for(int i=low;i<=high;i++) {
			temp[i]=arr[i];
		}
		int i=low,j=mid+1,k=low;
		while(i<=mid && j<=high) {
			if(temp[i]<=temp[j]) {
				arr[k]=temp[i];
				i++;
			}else {
				arr[k]=temp[j];
				j++;
			}
			k++;
		}
		while(i<=mid) {
			arr[k]=temp[i];
			i++;
			k++;
		}
		
	}

	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		MergeSort m=new MergeSort();
		System.out.println("Enter the size of Array : ");
		int arrSize=s.nextInt();
		int[] arr=new int[arrSize];
		for(int i=0;i<arrSize;i++) {
			System.out.println("Enter "+(i+1)+" element : ");
			arr[i]=s.nextInt();
		}
		System.out.println("Array before sorting : ");
		m.printArray(arr);
		System.out.println("Array after merge sort : ");
		m.sort(arr, new int[arr.length], 0, arrSize-1);
		m.printArray(arr);
	}

}
