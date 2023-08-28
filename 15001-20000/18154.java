import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int t = Integer.parseInt(br.readLine());
		
		br.readLine();
		int answer = 0;
		int sa = 0, sb = 0;
		while(t --> 1) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			
			answer = Math.max(answer, (b - sb) / (a - sa));
			
			sa = a;
			sb = b;
		}
		System.out.print(answer);
	}
}
