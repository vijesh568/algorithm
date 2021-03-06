
public class BottomUpMergeSort {
	static Integer[] array = new Integer[] {7,10,5,3,8,4,2,9,6,1,15,12,13,11};
//	static Integer[] array = new Integer[] {10,5,4,3};
	
	public static void main(String[] args) {
		BottomUpMergeSort sort = new BottomUpMergeSort();
		sort.print();
		sort.sort();
		sort.print();
		sort.shuffle(array);
		sort.print();
		sort.sort();
		sort.print();
		sort.shuffle(array);
		sort.print();
		sort.sort();
		sort.print();
		sort.shuffle(array);
		sort.print();
		sort.sort();
		sort.print();
		
	}
	
	private void print() {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+", ");
		}
		System.out.println("");
	}
	
	public void shuffle(Integer[] array) {
		for (int i = 0; i < array.length; i++) {
			double rand = Math.random();
			int index = (int) (rand*(i+1));
			swap(array, index, i);
		}
	}

	public void sort() {
		Comparable<Integer>[] aux = new Comparable[array.length];
		int size = array.length;
		for (int sz = 1; sz < size; sz+=sz) {
			for (int i = 0; i < (size- sz); i+=(sz+sz)) {
				merge(array, aux, i, i+sz-1, Math.min(i+sz+sz-1,size-1));
			}
		}
	}
	
	
	private void merge(Comparable<Integer>[] arr, Comparable<Integer>[] aux, int lo, int mid, int hi) {
		for (int i = lo; i <= hi; i++) {
			aux[i] = arr[i];
		}
		int i = lo, j=mid+1;
		for (int k = lo; k <= hi; k++) {
			if (i>mid) {
				arr[k] = aux[j++];
			} else if (j>hi){
				arr[k] = aux[i++];
			} else if (less(aux[i], aux[j])) {
				arr[k] = aux[i++];
			} else {
				arr[k] = aux[j++];
			}
		}
	}
	
	private boolean less(Comparable<Integer> i, Comparable<Integer> j) {
		return ((i.compareTo((Integer) j))<0);
	}
	
	private void swap(Integer[] array, int i, int j) {
		Integer temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}
