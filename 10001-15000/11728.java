import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int sizea = Integer.parseInt(st.nextToken());
		int sizeb = Integer.parseInt(st.nextToken());
		
		int[] sum = new int[sizea + sizeb];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < sizea; i++) {
			sum[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		for(int i = sizea; i < sum.length; i++) {
			sum[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(sum);
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < sum.length; i++) {
			sb.append(sum[i] + " ");
		}
		System.out.println(sb);
	}
}
