package StageFiles;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ccc19j4 {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		int[][] grid = { { 1, 2 }, { 3, 4 } };
		String inputString = br.readLine();
		char[] inputs = inputString.toCharArray();
		for(int i = 0; i < inputs.length; i++) {
			if(inputs[i] == 'H') {
				int[] temp = grid[0];
				grid[0] = grid[1];
				grid[1] = temp;
			}
			if(inputs[i] == 'V') {
				int tTemp = grid[0][0];
				int bTemp = grid[1][0];
				grid[0][0] = grid[0][1];
				grid[1][0] = grid[1][1];
				grid[0][1] = tTemp;
				grid[1][1] = bTemp;
			}
		}
		System.out.println(grid[0][0] + " " + grid[0][1]);
		System.out.println(grid[1][0] + " " + grid[1][1]);
	}

}
