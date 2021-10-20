package StageFiles;
import java.util.Scanner;
public class cccj420 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String T = in.next();
		String S  = in.next();
		String sCopy = S;
		String[] sShifts = new String[S.length()];
		boolean hasShift = false;
		for(int i = 0; i < sShifts.length; i++) {
			sShifts[i] = sCopy;
			char tempF = sCopy.charAt(0);
			sCopy = sCopy.replaceFirst(tempF + "", "");
			sCopy = sCopy + "" + tempF;
		}
		for(int i = 0; i < sShifts.length; i++) {
			if(T.contains(sShifts[i])) {
				hasShift = true;
				i += sShifts.length + 10;
			}
		}
		if(hasShift) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
		
	}

}
