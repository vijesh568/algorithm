
public class UnionFind {
	
	public static void main(String[] args) {
		
	}

	int[] array = null;
	
	public void UnionFind(int n) {
		array = new int[n];
		for (int i = 0; i < array.length; i++) {
			array[i] = i;
		}
	}
	
	private int root(int index) {
		while (array[index] != index) {
			index = array[index];
		}
		return index;
	}
	
	public void union(int p, int q) {
		int rootP = root(p);
		int rootQ = root(q);
	}
}
