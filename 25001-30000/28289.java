import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		int[] answer = new int[4];
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int g = Integer.parseInt(st.nextToken()), c = Integer.parseInt(st.nextToken());
			
			if(g < 2) {
				answer[3]++;
			}
			else {
				answer[c == 1 || c == 2 ? 0 : c == 3 ? 1 : 2]++;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int a : answer) {
			sb.append(a).append("\n");
		}
		System.out.print(sb);
	}
}
