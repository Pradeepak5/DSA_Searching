import java.util.Scanner;

public class BinarySearch {
	
	public int search(int[] arr, int key) {
		int low=0;
		int high=arr.length-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]==key) {
				return mid;
			}
			if(key<arr[mid]) {
				high=arr[mid-1];
			}else {
				low=arr[mid+1];
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		BinarySearch b=new BinarySearch();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of Array : ");
		int arrSize=s.nextInt();
		int[] arr=new int[arrSize];
		for(int i=0;i<arrSize;i++) {
			System.out.println("Enter "+(i+1)+" element : ");
			arr[i]=s.nextInt();
		}
		System.out.println("Enter the element to search in an array: ");
		int key=s.nextInt();
		if(b.search(arr, key)==-1) {
			System.out.println("Element not found.");
		}else {
			System.out.println("Element found in index : "+(b.search(arr, key)));
		}
	}

}
