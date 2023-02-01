import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int[] birthday = new int[12];
		
		int t = Integer.parseInt(br.readLine());
		
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			st.nextToken();
			
			birthday[Integer.parseInt(st.nextToken().split("/")[1]) - 1]++;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 12; i++) {
			sb.append(i + 1).append(" ").append(birthday[i]).append("\n");
		}
		System.out.print(sb);
	}
}
