
public class QuickSort_3_way {
	static Integer[] array = new Integer[] {7,10,5,3,8,4,2,9,6,14,0,1,15,12,13,11};
	
	public static void main(String[] args) {
		QuickSort_3_way sort = new QuickSort_3_way();
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
		int i = lo+1, gt = hi, lt = lo;
		while(i<=gt) {
			if (less(a[i],a[lt])) {
				swap(a, i, lt);
				lt++;i++;
			} else if (a[i].equals(a[lt])) {
				i++;
			}else {
				swap(a, i, gt);
				gt--;
			}
		}
		
		
		sort(a, lo, lt-1);
		sort(a, i, hi);
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
