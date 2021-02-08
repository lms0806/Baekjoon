import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int[] pull = {1,1,2,2,2,8};
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < pull.length; i++) {
			pull[i] -= Integer.parseInt(st.nextToken());
			sb.append(pull[i]).append(" ");
		}
		System.out.print(sb);
	}
}
