import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int t = Integer.parseInt(br.readLine());
		
		int[] num = new int[10];
		int[] result = new int[t];
		
		for(int i = 0; i < t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			for(int j = 0; j < 10; j++) {
				num[j] = Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(num);
			
			result[i] = num[10-3];
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < t; i++) {
			sb.append(result[i]).append("\n");
		}
		System.out.print(sb);
	}
}
