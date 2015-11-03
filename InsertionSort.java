
public class InsertionSort {
	int[] array = new int[] {7,10,5,3,8,4,2,9,6};
	
	public static void main(String[] args) {
		InsertionSort sort = new InsertionSort();
		sort.sort();
		sort.print();
	}
	
	private void print() {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+", ");
		}
	}
	
	public void sort() {
		for (int i = 1; i < array.length; i++) {
			for (int j = i; j > 0; j--) {
				if (less(array[j], array[j - 1])) {
					swap(array, j, j - 1);
				} else {
					break;
				}
			}
		}
	}
	
	private boolean less(int i, int j) {
		return i < j;
	}
	
	private void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}
