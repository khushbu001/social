package social;

//2) Given an array arr of size N and an integer K, the task is to find the maximum for each and every
//contiguous subarray of size K.
//Example Input & Output:
//Input: arr[] = {1, 2, 3, 1, 4, 5, 2, 3, 6}, K = 3
//Output: 3 3 4 5 5 5 6
//Input: arr[] = {8, 5, 10, 7, 9, 4, 15, 12, 90, 13}, K = 4
//Output: 10 10 10 15 15 90 90
import java.util.ArrayList;
import java.util.List;

public class MaximumInArraySizeK {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 1, 4, 5, 2, 3, 6 };
		int size = 3;
		List<Integer> arrayList = new ArrayList<>();
		for (int i = 0; i <= arr.length - size; i++) {
			int max = 0;
			for (int j = i; j < i + size; j++) {
				if (max < arr[j]) {
					max = arr[j];
				}
			}
			arrayList.add(max);
			System.out.print(max + " ");
		}

	}

}
