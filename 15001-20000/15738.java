import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), idx = Integer.parseInt(st.nextToken());
		int t = Integer.parseInt(st.nextToken());
		
		br.readLine();
		
		while(t --> 0) {
			int num = Integer.parseInt(br.readLine());
			
			if(num > 0 && idx <= num) {
				idx = num - idx + 1;
			}
			else if(num < 0 && idx > n + num) {
				idx = 2 * n - idx + num + 1;
			}
		}
		System.out.print(idx);
	}
}
