import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] call = {30, 35, 40};
		int[] data = {40, 30, 20};
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int c = Integer.parseInt(st.nextToken()), d = Integer.parseInt(st.nextToken());
			
			if(c == 0 && d == 0) {
				break;
			}
			
			int min = Integer.MAX_VALUE;
			for(int i = 0; i < 3; i++) {
				min = Math.min(min, c * call[i] + d * data[i]);
			}
			sb.append(min).append("\n");
		}
		System.out.print(sb);
	}
}
