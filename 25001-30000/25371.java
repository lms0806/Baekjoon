import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long n = Long.parseLong(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		long sum = 0;
		st = new StringTokenizer(Long.toString(n, k), "0");
		while(st.hasMoreTokens()) {
			sum += Long.parseLong(st.nextToken());
		}
		
		System.out.print(Long.toString(sum, k));
	}
}
