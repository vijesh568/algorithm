
public class SortItem implements Comparable<SortItem>{
	
	private int value = -1;
	public SortItem(int value) {
		this.value = value;
	}

	@Override
	public int compareTo(SortItem o) {
		if(this.value > o.value) {
			return 1;
		} else if(this.value == o.value) {
			return 0;
		} else {
			return -1;
		}
	}

}
