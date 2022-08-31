import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());
		
		int min = Integer.MAX_VALUE, sum = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			int num = Integer.parseInt(st.nextToken());
			if(num == -1) {
				sum += min;
				min = Integer.MAX_VALUE;
			}
			else {
				min = Math.min(min, num);
			}
		}
		
		System.out.print(sum + min);
	}
}
