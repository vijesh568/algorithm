
public class SelectionSort {
	int[] array = new int[] {7,10,5,3,8,4,2,9,6};
	
	public static void main(String[] args) {
		SelectionSort sort = new SelectionSort();
		sort.sort();
		sort.print();
	}
	
	private void print() {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+", ");
		}
	}
	
	public void sort() {
		for (int i = 0; i < array.length; i++) {
			int min = i;
			for (int j = i+1; j < array.length; j++) {
				if (less(array[j], array[min])) {
					min = j;
				}
			}
			swap(array, i, min);
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
