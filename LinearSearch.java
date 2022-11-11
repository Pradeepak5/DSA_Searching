import java.util.Scanner;

public class LinearSearch {
	
	public int search(int[] arr,int key) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		LinearSearch l=new LinearSearch();
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
		if(l.search(arr,key)==-1) {
			System.out.println("Element not found.");
		}else {
			System.out.println("Element found in index : "+l.search(arr, key));
		}
	}

}
