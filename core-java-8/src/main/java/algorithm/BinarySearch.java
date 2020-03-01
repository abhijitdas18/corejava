package algorithm;

import java.util.Arrays;

// Binary Search
// 1. recursive 
// 2. 
public class BinarySearch {

	public static void main(String[] args) {

		int[] num = { 23, 12, 8, 100, 34, 23 };
		int searchNo = 23;
		binarySearch(num, searchNo);

	}
    // 1st sort the array
	public static void binarySearch(int[] num, int no) {
		sortArray(num);
		int start = 0;
		int end = num.length - 1;
		int result = binarySearch(num, start, end, no);
		
		System.out.println(result <1 ? "Not found." : "Found");

	}

	public static int  binarySearch(int[] num, int start, int end, int no) {
		
		// mid = start + (end -tart)/2
		int mid = start + (end - start) / 2;
		if (end >= 1 && mid <= end) {
			

			if (no == num[mid]) {
				System.out.println("The no.  is found at " + mid);
				return mid;
			}
			if (num[mid]> no) {
				return binarySearch(num, start, mid -1 , no);
			} else {
				return binarySearch(num, mid +1 , end, no);
			}
		}
		return -1;

	}

	public static void sortArray(int[] num) {
		Arrays.sort(num);
	}
}
