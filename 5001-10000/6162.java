import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= size; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			
			int count = -1;
			while(a > b) {
				b *= 5;
				count++;
			}
			
			sb.append("Data Set ").append(i).append(":\n");
			if(count == -1) {
				sb.append("no ");
			}
			else {
				while(count --> 0) {
					sb.append("mega ");
				}
			}
			sb.append("drought\n\n");
		}
		System.out.print(sb);
	}
}
