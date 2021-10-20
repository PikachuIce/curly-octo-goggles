package StageFiles;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class cccj520 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int M = in.nextInt();
		int N = in.nextInt();
		int[][] grid = new int[N][M];
		for(int i = 0; i < M; i++) {
			for(int j = 0; j < N; j++) {
				grid[j][i] = in.nextInt();
			}
		}
		
		int row = 0;
		int col = 0;
		boolean escaped = false;
		while(true) {
			int temp = grid[row][col];
			int[] factors = findFactors(temp);
			
		}
		
	}
	
	public static int[] findFactors(int num) {        
	    ArrayList<Integer> factors = new ArrayList<Integer>();
	    int incrementer = num % 2 == 0 ? 1 : 2;

	    for (int i = 1; i <= Math.sqrt(num); i += incrementer) {
	    	if (num % i == 0) {
	            factors.add(i);
	            if (i != num / i) {
	                factors.add(num / i);
	            }

	        }
	    }

	    // Sort the list of factors
	    Collections.sort(factors);
	    Object[] factorsConv = factors.toArray();
	    int[] factorsReturn = new int[factorsConv.length];
	    for(int i = 0; i < factorsConv.length; i++) {
	    	factorsReturn[i] = (int) factorsConv[i];
	    }
	    return factorsReturn;
	}

}
