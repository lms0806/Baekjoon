import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(size --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			sb.append(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			
			if(n >= 97) {
				sb.append(" A+");
			}
			else if(n >= 90) {
				sb.append(" A");
			}
			else if(n >= 87) {
				sb.append(" B+");
			}
			else if(n >= 80) {
				sb.append(" B");
			}
			else if(n >= 77) {
				sb.append(" C+");
			}
			else if(n >= 70) {
				sb.append(" C");
			}
			else if(n >= 67) {
				sb.append(" D+");
			}
			else if(n >= 60) {
				sb.append(" D");
			}
			else {
				sb.append(" F");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
