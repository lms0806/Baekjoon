import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int t = Integer.parseInt(st.nextToken()), num = Integer.parseInt(st.nextToken());
		
		int count = 0;
		while(t --> 0) {
			int n = Integer.parseInt(br.readLine());
			
			if(num > n) {
				count--;
			}
			else if(num < n) {
				count++;
			}
		}
		
		System.out.print(count < 0 ? 1 : count > 0 ? 2 : 0);
	}
}
