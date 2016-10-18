package hackerrank;

import java.io.*;
import java.util.*;

public class GridChallenge {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner s = new Scanner(System.in);
        int noOfSamples = Integer.parseInt(s.nextLine().trim());
        String[][] matrix = new String[noOfSamples][];
        boolean[] isMatrix = new boolean[noOfSamples];
        for (int i = 0; i < noOfSamples; i++) {
			int n = Integer.parseInt(s.nextLine().trim());
			matrix[i] = new String[n];
			for (int j = 0; j < n; j++) {
				matrix[i][j] = s.nextLine().trim();
			}
		}
        
        for (int i = 0; i < matrix.length; i++) {
        	loop:
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j]= sortString(matrix[i][j]);
				if (j > 0) {
					for (int k = 0; k < matrix[i].length; k++) {
						if(matrix[i][j-1].charAt(k) > matrix[i][j].charAt(k)) {
							isMatrix[i] = true;
							break loop;
						}
					}
				}
			}
		}
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < isMatrix.length; i++) {
			String val = (isMatrix[i])?"NO":"YES";
			builder.append(val+"\n");
		}
        System.out.println(builder.toString());
    }
    
    public static String sortString(String s) {
    	char[] c = s.toCharArray();
    	Arrays.sort(c);
    	return new String(c);
    }
}
