import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int n, m;
	static int[] array;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		array = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(array);
		
		int[] num = new int[m];
		dfs(num, 0, 0);
		
		System.out.print(sb);
	}
	
	public static void dfs(int[] num, int depth, int which) {
		if(depth == m) {
			for(int nn : num) {
				sb.append(nn).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		int number = 0;
		for(int i = which; i < n; i++) {
			if(number != array[i]) {
				num[depth] = array[i];
				number = array[i];
				dfs(num, depth + 1, i);
			}
		}
	}
}
