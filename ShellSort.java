
public class ShellSort {
	int[] array = new int[] {7,10,5,3,8,4,2,9,6,1,15,12,13,11};
	
	public static void main(String[] args) {
		ShellSort sort = new ShellSort();
		sort.sort();
		sort.print();
	}
	
	private void print() {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+", ");
		}
		System.out.println("");
	}
	
	public void sort() {
		
		int h = 1;
		while (h<(array.length/3)) {
			h= h*3+1;
		}
		System.out.println("h:"+h);
		
		while (h >= 1) {
			System.out.println("h1:"+h);
			for (int i = h; i < array.length; i+=h) {
				for (int j = i; j >= h; j-=h) {
					if (less(array[j], array[j - h])) {
						swap(array, j, j - h);
					} else {
						break;
					}
				}
			}
			h= h/3;
			print();
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
