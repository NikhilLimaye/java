


public class QuickSort {

	public static void main(String[] args) {
		
		int arr[] = {8,6,3,2,1};
		int n = arr.length;
		QuickSort qs = new QuickSort();
		qs.sort(arr , 0, n -1 );
		System.out.println("Sorted array -");
		printarray(arr);

	}

	private void sort(int[] arr, int low, int high) {
		
		if(low < high) {
			
			int pi = partition(arr , low , high);
			sort(arr , low , pi-1);
			sort(arr , pi+1, high);
		}
		
	}

	/*
	 * Takes last element as pivot - places the pivot in its correct position
	 * Places all smaller elements to its left and the rest to its right
	 */
	private int partition(int[] arr, int low, int high) {
		
		int pivot = arr[high];
		int i = low-1;
		
		for(int j = low ; j<high ; j++) {
			
			if(arr[j] <= pivot) {
				i++;
				
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;				
			}			
		}
		
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		
		return i+1;
	}

	private static void printarray(int[] arr) {
		
		for(int a : arr) {
			System.out.print(a +" ");
		}
	}
	

}
