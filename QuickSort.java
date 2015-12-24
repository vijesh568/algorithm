
public class QuickSort {
	static Integer[] array = new Integer[] {7,10,5,3,8,4,2,9,6,14,0,1,15,12,13,11};
	
	public static void main(String[] args) {
		QuickSort sort = new QuickSort();
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
		sort(array, 0, array.length-1);
	}
	
	private void sort(Comparable<Integer>[] a, int lo, int hi) {
		if (lo>=hi)
			return;
		
		int k = partition(a, lo, hi);
		sort(a, lo, k-1);
		sort(a, k+1, hi);
	}
	
	
	private int partition(Comparable<Integer>[] a, int lo, int hi) {
		int i= lo, j = hi+1;
		
		while(true) {
			while(less(a[++i],a[lo])) {
				if (i>=hi) break;
			}
			while(less(a[lo],a[--j])) {
				if(j<=lo) break;
			}
			if (i<j) {
				swap(a, i, j);
			} else {
				break;
			}
		}
		swap(a,j,lo);
		return j;
	}
	
	private boolean less(Comparable<Integer> i, Comparable<Integer> j) {
		return ((i.compareTo((Integer) j))<0);
	}
	
	private void swap(Comparable<Integer>[] array, int i, int j) {
		Comparable<Integer> temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}
