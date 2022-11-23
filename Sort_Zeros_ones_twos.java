import java.util.*;
public class Sort_Zeros_ones_twos {
	
	public void sort(int[] arr) {
		int i=0,j=0,k=arr.length-1;
		while(i<=k) {
			if(arr[i]==0) {
				swap(arr,i,j);
				i++;
				j++;
			}else if(arr[i]==1) {
				i++;
			}else if(arr[i]==2) {
				swap(arr,i,k);
				k--;
			}
		}
	}

	private void swap(int[] arr, int i, int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
	}
	
	public void displayArr(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Sort_Zeros_ones_twos S=new Sort_Zeros_ones_twos();
		int[] arr= {2,1,2,0,0,2,1,0,1,1};
		S.sort(arr);
		System.out.println("Output : ");
		S.displayArr(arr);
	}

}
