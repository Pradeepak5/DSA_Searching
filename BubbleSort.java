import java.util.Scanner;
public class BubbleSort {
	
	public void sorting(int[] arr) {
		boolean isSwapped;
		for(int i=0;i<arr.length-1;i++) {
			isSwapped=false;
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					isSwapped=true;
				}
			}
			if(isSwapped==false) {
				break;
			}
		}
	}

	public static void main(String[] args) {
		BubbleSort b=new BubbleSort();
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
		b.sorting(arr);
		System.out.println("After Sorting : ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
