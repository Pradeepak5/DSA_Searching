import java.util.Scanner;
public class MergeTwoSortedArray {
	
	public int[] mergeArray(int[] arr1, int[] arr2) {
		int[] result=new int[(arr1.length)+(arr2.length)];
		int i=0,j=0,k=0;
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]<arr2[j]) {
				result[k]=arr1[i];
				i++;
			}else {
				result[k]=arr2[j];
				j++;
			}
			k++;
		}
		while(i<arr1.length) {
			result[k]=arr1[i];
			i++;
			k++;
		}
		while(j<arr2.length) {
			result[k]=arr2[j];
			j++;
			k++;
		}
		return result;
	}

	public static void main(String[] args) {
		MergeTwoSortedArray m=new MergeTwoSortedArray();
		int[] arr1=new int[] {2,4,7,8};
		int[] arr2=new int[] {1,3,9,11};
		int[] result=m.mergeArray(arr1, arr2);
	    for(int i=0;i<result.length;i++) {
	    	System.out.print(result[i]+" ");
	    }

	}

}
