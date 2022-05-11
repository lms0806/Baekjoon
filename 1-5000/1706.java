import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	static char[][] chs;
	static ArrayList<String> arr = new ArrayList<>();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		chs = new char[n][m];
		
		for(int i = 0; i < n; i++) {
			chs[i] = br.readLine().toCharArray();
		}
		
		solve(n, m, true);
		solve(m, n, false);
		
		Collections.sort(arr);
		
		print();
	}
	
	public static void solve(int n, int m, boolean flag) {
		for(int i = 0; i < n; i++) {
			int start = 0;
			for(int j = 0; j < m; j++) {
				if((flag && chs[i][j] == '#') || (!flag && chs[j][i] == '#')) {
					String s = "";
					for(int k = start; k < j; k++) {
						s += flag ? chs[i][k] : chs[k][i];
					}
					arr.add(s);
					start = j + 1;
				}
			}
			if(start != m) {
				String s = "";
				for(int k = start; k < m; k++) {
					s += flag ? chs[i][k] : chs[k][i];
				}
				arr.add(s);
			}
		}
	}
	
	public static void print() {
		for(String s : arr) {
			if(s.length() >= 2) {
				System.out.print(s);
				return;
			}
		}
	}
}
