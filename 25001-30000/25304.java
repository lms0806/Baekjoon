import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int x = Integer.parseInt(br.readLine());
		
		int t = Integer.parseInt(br.readLine());
		
		int y = 0;
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			y += Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
		}
		
		System.out.print(x == y ? "Yes" : "No");
	}
}
