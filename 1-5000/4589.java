import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		sb.append("Gnomes:\n");
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int[] num = new int[3];
			
			for(int i = 0 ; i < 3; i++) {
				num[i] = Integer.parseInt(st.nextToken());
			}
			
			if((num[1] - num[0]) * (num[2] - num[1]) > 0) {
				sb.append("Ordered");
			}
			else {
				sb.append("Unordered");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
