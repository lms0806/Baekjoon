import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
		while(n --> 0) {
			int num = Integer.parseInt(br.readLine());
			
			max = Math.max(max, num);
			min = Math.min(min, num);
		}
		
		System.out.print(Math.max(min - max / 2, 0));
	}
}
