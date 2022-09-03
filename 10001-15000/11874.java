import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int l = Integer.parseInt(br.readLine()), d = Integer.parseInt(br.readLine());
		int x = Integer.parseInt(br.readLine());
		
		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
		for(int i = l; i <= d; i++) {
			int num = i;
			int sum = 0;
			while(num != 0) {
				sum += num % 10;
				num /= 10;
			}
			
			if(sum == x) {
				max = Math.max(max, i);
				min = Math.min(min, i);
			}
		}
		
		System.out.print(min + "\n" + max);
	}
}
