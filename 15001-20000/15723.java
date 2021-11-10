import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int INF = 987654321;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[26][26];
		
		for(int i = 0; i < 26; i++) {
			for(int j = 0; j < 26; j++) {
				if(i != j) {
					arr[i][j] = INF;
				}
			}
		}
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = st.nextToken().charAt(0) - 'a';
			st.nextToken();
			int b = st.nextToken().charAt(0) - 'a';
			
			arr[a][b] = 1;
		}
		
		for(int k = 0; k < 26; k++) {
			for(int i = 0; i < 26; i++) {
				for(int j = 0; j < 26; j++) {
					arr[i][j] = Math.min(arr[i][k] + arr[k][j], arr[i][j]);
				}
			}
		}
		
		int m = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < m; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = st.nextToken().charAt(0) - 'a';
			st.nextToken();
			int b = st.nextToken().charAt(0) - 'a';
			
			sb.append(arr[a][b] != INF ? "T" : "F").append("\n");
		}
		System.out.print(sb);
	}
}
