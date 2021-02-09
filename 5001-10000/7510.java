import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());
		int[] num = new int[3];
		
        StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < 3; j++) {
				num[j] = Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(num);
			
			sb.append("Scenario #").append(i+1).append(":\n");
			
			if(num[0]*num[0] + num[1]*num[1] == num[2]*num[2]) {
				sb.append("yes");
			}
			else {
				sb.append("no");
			}
            sb.append("\n").append("\n");
		}
		System.out.print(sb);
	}
}
