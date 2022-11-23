import java.util.Scanner;
public class SearchInsert {
	
	public int searchInsert(int[] arr, int target) {
		int low=0;
		int high=arr.length-1;
		while(low<=high) {
			int mid=low+((high-low)/2);
			if(arr[mid]==target) {
				return mid;
			}
			if(arr[mid]>target) {
				high=mid-1;
			}else {
				low=mid+1;
			}
		}
		return low;
	}

	public static void main(String[] args) {
		SearchInsert S=new SearchInsert();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of Array : ");
		int arrSize=s.nextInt();
		int[] arr=new int[arrSize];
		for(int i=0;i<arrSize;i++) {
			System.out.println("Enter "+(i+1)+" element : ");
			arr[i]=s.nextInt();
		}
		System.out.println("Enter the element to target index of elemnt in an array: ");
		int target=s.nextInt();
		System.out.println("Element found in the index : "+S.searchInsert(arr, target));

	}

}
