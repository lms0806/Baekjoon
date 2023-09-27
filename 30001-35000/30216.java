import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int num = Integer.parseInt(st.nextToken()), max = 1, now = 1;
		
		for(int i = 1; i < n; i++) {
			int number = Integer.parseInt(st.nextToken());
			
			if(num < number) {
				now++;
			}
			else {
				max = Math.max(max, now);
				now = 1;
			}
			
			num = number;
		}
		System.out.print(Math.max(max, now));
	}
}
