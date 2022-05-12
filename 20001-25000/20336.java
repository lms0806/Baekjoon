import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[] arr = new int[2];
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			if(t == 0) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int n = Integer.parseInt(st.nextToken());
				
				sb.append(n).append("\n");
				while(n --> 0) {
					sb.append(st.nextToken()).append("\n");
				}
			}
			else {
				br.readLine();
			}
		}
		System.out.print(sb);
	}
}
