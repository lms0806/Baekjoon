import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in), 5); 
		
		int t = Integer.parseInt(br.readLine());
		
		int a = 0, b = 0;
		int aa = 0, bb = 0;
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int num = Integer.parseInt(st.nextToken());
			int na = Integer.parseInt(st.nextToken()), nb = Integer.parseInt(st.nextToken());
			
			a += na;
			b += nb;
			
			if(na > nb) {
				aa += num;
			}
			else if(na < nb) {
				bb += num;
			}
		}
		
		System.out.print(a > b && aa > bb ? 1 : a < b && aa < bb ? 2 : 0);
	}
}
