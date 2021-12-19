import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int num = Integer.parseInt(st.nextToken()) + 1;
		int size = Integer.parseInt(st.nextToken());
		
		int[] sum = new int[num];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 1; i < num; i++) {
			sum[i] =  sum[i - 1] + Integer.parseInt(st.nextToken());
		}
		
		StringBuilder sb = new StringBuilder();
		while(size --> 0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			
			sb.append(sum[b] - sum[a - 1]).append("\n");
		}
		System.out.print(sb);
	}
}
