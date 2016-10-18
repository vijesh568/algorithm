package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Semaphore;

public class MatchingSets {

	
	static List<Integer> lx;
	static List<Integer> ly;
	public static void main(String[] args) {

		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));

		int n;
		try {
			n = Integer.parseInt(b.readLine().trim());
			if (!(n>=1 && n<= (100000))) {
				return;
			}
			String[] xNumbers = b.readLine().trim().split(" ");
			String[] yNumbers = b.readLine().trim().split(" ");
			Integer[] x = new Integer[n];
			Integer[] y = new Integer[n];

			for (int i = 0; i < n; i++) {
				x[i] = Integer.parseInt(xNumbers[i]);
				y[i] = Integer.parseInt(yNumbers[i]);
				if (!((rangeCheck(x[i]) || rangeCheck(y[i])))) {
					return;
				}
			}

			lx = new ArrayList<>(Arrays.asList(x));
			ly = new ArrayList<>(Arrays.asList(y));
			
			removeCommon();
			
			long count = 0;
			int size = lx.size();
			long total = 0;
			for (int i = 0; i < size; i++) {
				int diff = lx.get(i)-ly.get(i);
				if (diff >0) {
					count +=diff;
				}
				total+=diff;
			}
			if (total != 0) {
				System.out.println(-1);
				return;
			}
			
			System.out.println(count);
			

			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static boolean rangeCheck(Integer i) {
		return ((i>=-1000000000) && (i <= 1000000000));
	}
	
	public static void removeCommon() {
		lx.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				if (o1<o2) {
					return -1;
				} else if (o1>o2) {
					return 1;
				}
				return 0;
			}
		});
		ly.sort(new Comparator<Integer>() {
			
			@Override
			public int compare(Integer o1, Integer o2) {
				if (o1<o2) {
					return -1;
				} else if (o1>o2) {
					return 1;
				}
				return 0;
			}
		});
	}
}
