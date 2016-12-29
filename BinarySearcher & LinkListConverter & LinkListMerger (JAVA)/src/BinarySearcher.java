
public final class BinarySearcher implements ISearcher {

	private static ISearcher sInstace;

	public static ISearcher getInstace() {
		if (sInstace == null) {
			sInstace = new BinarySearcher();
		}
		return sInstace;
	}

	@Override
	public int search(int[] data, int target) {
		int low = 0;
		int high = data.length - 1;
		int mid;
		while (low <= high) {
			mid = (low + high) / 2;
			if (data[mid] < target) {
				low = mid + 1;
			} else if (data[mid] > target) {
				high = mid - 1;
			} else {
				return mid;
			}
		}
		return -1;
	}
}
