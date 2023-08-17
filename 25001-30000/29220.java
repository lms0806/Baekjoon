import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());
		
		int t = Integer.parseInt(br.readLine());
		
		int sum = 0, min = Integer.MAX_VALUE;
		StringTokenizer st = new StringTokenizer(br.readLine());
		while(t --> 0) {
			int num = Integer.parseInt(st.nextToken());
			
			sum += num;
			min = Math.min(min, num);
		}
		System.out.print(sum - min >= n ? "YES" : "NO");
	}
}
