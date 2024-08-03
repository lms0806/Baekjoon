import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char c = br.readLine().charAt(0); 
		
		int idx = c == 'E' ? 0 : c == 'W' ? 1 : c == 'S' ? 2 : 3;
		
		System.out.print(solve(idx, br.readLine() + br.readLine()));
	}
	
	public static String solve(int idx, String s) {
		String[][] db = {{"O..P", ".PI.", ".PO."},{"P..O", ".IP.", ".OP."},{".OP.", "I..P", "O..P"},{".PO.", "P..I", "P..O"}};
		String[] answer = {"T", "F", "Lz"};
		
		for(int i = 0; i < 3; i++) {
			if(s.equals(db[idx][i])) {
				return answer[i];
			}
		}
		
		return "?";
	}
}
