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
			int n = Integer.parseInt(br.readLine());
			String a = br.readLine(), b = br.readLine();
			
			sb.append("Case ").append(i).append(": ");
			int answer = 0;
			for(int j = 0; j < n; j++) {
				if(a.charAt(j) != b.charAt(j)) {
					answer++;
				}
			}
			sb.append(answer).append("\n");
		}
		System.out.print(sb);
	}
}
