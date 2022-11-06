import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int m = Integer.parseInt(st.nextToken()), n = Integer.parseInt(st.nextToken());
			
			BigInteger[] arr = new BigInteger[m];
			
			Arrays.fill(arr, BigInteger.ONE);
			
			while(n --> 0) {
				st = new StringTokenizer(br.readLine());
				for(int i = 0; i < m; i++) {
					arr[i] = arr[i].multiply(new BigInteger(st.nextToken()));
				}
			}
			
			BigInteger max = arr[0];
			int answer = 1;
			for(int i = 1; i < m; i++) {				
				if(arr[i].compareTo(max) >= 0) {
					max = arr[i];
					answer = i + 1;
				}
			}
			sb.append(answer).append("\n");
		}
		System.out.print(sb);
	}
}
