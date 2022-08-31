import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());
		
		boolean[][] alpha = new boolean[52][52];
		while(n --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			char a = st.nextToken().charAt(0);
			st.nextToken();
			char b = st.nextToken().charAt(0);
			
			if(a == b) {
				continue;
			}
			
			a = (char) (a >= 'A' && a <= 'Z' ? a - 'A' : a - 'a' + 26);
			b = (char) (b >= 'A' && b <= 'Z' ? b - 'A' : b - 'a' + 26);

			alpha[a][b] = true;
		}
		
		for(int k = 0; k < 52; k++) {
			for(int i = 0; i < 52; i++) {
				for(int j = 0; j < 52; j++) {
					if(i != j && !alpha[i][j] && alpha[i][k] && alpha[k][j]) {
						alpha[i][j] = true;
					}
				}
			}
		}
		
		ArrayList<String> arr = new ArrayList<>();
		for(int i = 0; i < 52; i++) {
			for(int j = 0; j < 52; j++) {
				if(alpha[i][j]) {
					char a = (char) (i < 26 ? i + 'A' : i + 'a' - 26);
					char b = (char) (j < 26 ? j + 'A' : j - 26 + 'a');
					
					arr.add(a + " => " + b);
				}
			}
		}
		
		Collections.sort(arr);
		
		StringBuilder sb = new StringBuilder();
		sb.append(arr.size()).append("\n");
		for(String s : arr) {
			sb.append(s).append("\n");
		}
		System.out.print(sb);
	}
}
