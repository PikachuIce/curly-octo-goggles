package StageFiles;
import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class cccj518 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		int N = Integer.parseInt(in.readLine());
		int[][] pages = new int[N][N+1];
		HashSet<Integer> reachable = new HashSet<Integer>();
		for (int i = 0; i < N; i++) {
			String inputTemp = in.readLine();
			String[] inputArr = inputTemp.split(" ");
			int[] temp = new int[N+1];
			for (int j = 0; j < inputArr.length; j++) {
				temp[j] = Integer.parseInt(inputArr[j]);
				reachable.add(temp[j]);
			}
			temp[N] = inputArr.length; // how many choices
			pages[i] = temp;
		}
		if (reachable.size() == N) {
			System.out.println("Y");
		} else {
			System.out.println("N");
		}
		int[][] choice = new int[N][3];
		int curPos = 0;
		ArrayList<Integer> trail = new ArrayList<Integer>();
		for(int i = 0; i < N; i++) {
			choice[i][0] = i;
			//page number
			choice[i][1] = 0;
			//choice chosen
			choice[i][2] = 1;
			//increment = 1; decrement = -1;
		}
		trail.add(1);
		while(true) {
			int[] choicesHere = pages[curPos];
			if(choicesHere[0] == 0) {
				break;
			}
			int nextInd = choicesHere[choice[curPos][1]];
			// choose next index
			if(nextInd == 1) {
				trail.clear();
			}
			trail.add(nextInd);
			
			if(choice[curPos][1] == pages[curPos][N+1]) {
				choice[curPos][2] = -1;
			}
			if(choice[curPos][1] == 0) {
				choice[curPos][2] = 1;
			}
			choice[curPos][1] += choice[curPos][2];
			curPos = nextInd;
			
		}
		Object[] fTrailRaw = trail.toArray();
		int[] fTrailArr = new int[fTrailRaw.length];
		for(int i = 0; i < fTrailRaw.length; i++) {
			fTrailArr[i] = Integer.parseInt((String) fTrailRaw[i]);
		}
		Set<Integer> checkSet = new HashSet<Integer>();
		int dupEnd = -1;
//		int dupNum = 
		for(int i = fTrailArr.length; i >= 0 ; i--) {
			int check = fTrailArr[i];
			if(checkSet.add(check) == false) {
				dupEnd = check;
				
			}
		}
		
		// search may or may not work
		// last part here attempts to remove duplicates
		// will eventually print out the shortest path
		/* ex.			3 is end
		 * trail:
		 * 1
		 * 2
		 * 6
		 * 7
		 * 2
		 * 5
		 * 2
		 * 8
		 * 7
		 * 4
		 * 
		 * 
		 * Reduced to:
		 * 1
		 * 2
		 * 4
		 * Prints:
		 * 3
		 * 
		 * Search for duplicates, then remove elements in between
		 * try to search for duplicates with largest range of in-betwen duplicates
		 * 
		 * 
		 * 
		 * Example Page: 
		 * 1	3 2 6
		 * 2	3 5 4
		 * 3	1
		 * 4	0
		 * 5	2 3 1
		 * 6	3
		 */
	}

}
