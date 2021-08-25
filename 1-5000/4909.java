import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			int min = Integer.MAX_VALUE, max = 0, num = 0, answer = 0;
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i = 0; i < 6; i++) {
				num = Integer.parseInt(st.nextToken());
				
				min = Math.min(min, num);
				max = Math.max(max, num);
				
				answer += num;
			}
			
			if(answer == 0) {
				break;
			}
			
			answer -= min + max;
			if(answer % 4 == 0) {
				sb.append(answer / 4);
			}
			else {
				sb.append((double)answer / 4);
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
