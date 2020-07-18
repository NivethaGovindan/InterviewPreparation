package microsoftInterviewPrep;

public class SearchSortedRotatedArray {

	static void pivotedBinarySearch(int[] a, int key){

		int n = a.length -1;
		int pivot = findPivot(a, 0, n);


		if(a[pivot] == key)
			System.out.println(pivot);

		else if(key > a[0])
			System.out.println(binarySearch(a, 0, pivot-1, key));
		else
			System.out.println(binarySearch(a, pivot+1, n, key));

	}
	

	static int findPivot(int[] a, int low, int high){

		if(high < low)
			return -1;

		int mid = (low + high) / 2;

		if( a[mid] > a[mid+1])
			return mid;

		if(a[low] > a[mid])
			return findPivot(a, low, mid-1);
		
		return findPivot(a, mid+1, high);	

	}

	static int binarySearch(int[] a, int low, int high, int key){

		if(high < low){
			return -1;
		}

		int mid = (low+high)/ 2;

		if(key == a[mid])
			return mid;
		
		if(key < a[mid])
			return binarySearch(a, low, mid-1, key);

		return binarySearch(a, mid+1, high, key);
	}

	public static void main(String[] args){

		int a[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};

		int key = 3;
		
		pivotedBinarySearch(a, key);
	}

}
