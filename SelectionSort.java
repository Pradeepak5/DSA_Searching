import java.util.Scanner;
public class SelectionSort {
	
	private void sorting(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int min=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}
		
	}
	
	public static void main(String[] args) {
		SelectionSort S=new SelectionSort();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of Array : ");
		int arrSize=s.nextInt();
		int[] arr=new int[arrSize];
		for(int i=0;i<arrSize;i++) {
			System.out.println("Enter "+(i+1)+" element : ");
			arr[i]=s.nextInt();
		}
		System.out.println("Before Sorting : ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		S.sorting(arr);
		System.out.println("After Sorting : ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}
}
