import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int totalstudent = Integer.parseInt(st.nextToken());
			int num = Integer.parseInt(st.nextToken());
			
			int n = Integer.parseInt(br.readLine());
			
			sb.append("Practice #").append(i).append(": ").append(totalstudent).append(" ").append(num).append("\n");
			while(n --> 0) {
				int student = Integer.parseInt(br.readLine());
				
				while(student >= num) {
					num *= 2;
				}
				
				num -= student;
				sb.append(student).append(" ").append(num).append("\n");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
