import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] sum = new int[Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())];
		
		int count = 0;
		for(int i = 0; i < 2; i++) {
			st = new StringTokenizer(br.readLine());
			while(st.hasMoreTokens()) {
				sum[count] = Integer.parseInt(st.nextToken());
				count++;
			}
		}
		
		Arrays.sort(sum);
		
		StringBuilder sb = new StringBuilder();	
		for(int i = 0; i < sum.length; i++) {
			sb.append(sum[i]).append(" ");
		}
		System.out.print(sb);
	}
}
