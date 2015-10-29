
public class UnionFind {
	
	public static void main(String[] args) {
		UnionFind find = new UnionFind(10);
		find.union(4,3);
		find.print();
		find.union(3,8);
		find.print();
		find.union(6,5);
		find.print();
		find.union(9,4);
		find.print();
		find.union(2,1);
		find.print();
		find.union(5,0);
		find.print();
		find.union(7,2);
		find.print();
		find.union(6,1);
		find.print();
		find.union(7,3);
		find.print();
	}
	
	private void print() {
		System.out.print("Array::");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println("");
		System.out.print("Size:");
		for (int i = 0; i < size.length; i++) {
			System.out.print(size[i]+" ");
		}
		System.out.println("");
	}

	int[] array = null;
	int[] size = null;
	
	public UnionFind(int n) {
		array = new int[n];
		size = new int[n];
		for (int i = 0; i < array.length; i++) {
			array[i] = i;
			size[i] = 1;
		}
	}
	
	private int root(int index) {
		while (array[index] != index) {
//			array[index] = array[array[index]];
			index = array[index];
		}
		return index;
	}
	
	public void union(int p, int q) {
		int rootP = root(p);
		int rootQ = root(q);
		if (rootP == rootQ) {
			return;
		}
		if (size[p] >= size[q]) {
			array[rootQ] = rootP;
			size[rootP] += size[rootQ];
		} else {
			array[rootP] = rootQ;
			size[rootQ] += size[rootP];
		}
	}
	
	public boolean find(int p, int q) {
		int rootP = root(p);
		int rootQ = root(q);
		return (rootP == rootQ);
	}
}
