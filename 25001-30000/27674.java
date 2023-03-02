import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			br.readLine();
			
			char[] c = br.readLine().toCharArray();
			
			Arrays.sort(c);
			
			long answer = 0;
			for(int i = c.length - 1; i > 0; i--) {
				answer = answer * 10 + (c[i] - '0');
			}
			
			sb.append(answer + c[0] - '0').append("\n");
		}
		System.out.print(sb);
	}
}
