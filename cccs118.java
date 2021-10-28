package StageFiles;
import java.io.*;
import java.util.Arrays;

public class cccs118 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		int N = Integer.parseInt(in.readLine());
		int[] locations = new int[N];
		for (int i = 0; i < N; i++) {
			locations[i] = Integer.parseInt(in.readLine());
		}
		Arrays.sort(locations);
		double[] midpoints = new double[N - 1];
		double[] sizes = new double[N];
		for (int i = 0; i < N - 1; i++) {
			midpoints[i] = (locations[i] + locations[i + 1]) / 2;

		}
		sizes[0] = 1100000000;
		sizes[N-1] = 1100000000;
		for (int i = 1; i < N - 1; i++) {
			sizes[i] += midpoints[i] - midpoints[i - 1];
		}
		Arrays.sort(sizes);
		System.out.println(sizes[0]);
		/*
		 * calculate midpoints, then sizes, then sort array to get smallest sized place
		 * passes test case, but not DMOJ case
		 * 
		 */
	}

}
