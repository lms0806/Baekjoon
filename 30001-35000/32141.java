import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), h = Integer.parseInt(st.nextToken());
		
		int count = 0;
		st = new StringTokenizer(br.readLine());
		while(n --> 0) {
			h -= Integer.parseInt(st.nextToken());

			count++;
			
			if(h <= 0) {
				break;
			}
		}
		
		System.out.print(h > 0 ? -1 : count);
	}
}
