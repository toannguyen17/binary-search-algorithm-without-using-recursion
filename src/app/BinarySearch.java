package app;

public class BinarySearch {
	static int[] list = {1, 3, 5, 7, 10, 16, 17, 29, 30, 56, 69, 80, 81, 88, 89, 98, 99};

	static int binarySearch(int[] list, int key) {
		int low = 0;
		int high = list.length - 1;
		while (high >= low) {
			int mid = (low + high) / 2;

			if (key == list[mid])
				return mid;
			else if (key > list[mid])
				low = mid + 1;
			else
				high = mid - 1;

		}
		return -1;
	}

	public static void main(String[] args) {
		System.out.println(binarySearch(list, 2));
		System.out.println(binarySearch(list, 11));
		System.out.println(binarySearch(list, 79));
		System.out.println(binarySearch(list, 1));
		System.out.println(binarySearch(list, 5));
		System.out.println(binarySearch(list, 80));
	}
}
