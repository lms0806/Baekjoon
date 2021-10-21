import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		boolean b = true;
		while(m --> 0) {
			int k = Integer.parseInt(br.readLine());
			
			int a = n + 1;

			st = new StringTokenizer(br.readLine());
			while(k --> 0) {
				int num = Integer.parseInt(st.nextToken());
				
				if(num > a) {
					b = false;
					break;
				}
				
				a = num;
			}
			if(!b) {
				break;
			}
		}
		System.out.print(b ? "Yes" : "No");
	}
}
