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
			sb.append("Case ").append(i).append(": This list contains ");
			
			br.readLine();
			int answer = 0;
			StringTokenizer st = new StringTokenizer(br.readLine());
			while(st.hasMoreTokens()) {
				if(st.nextToken().equals("sheep")) {
					answer++;
				}
			}
			sb.append(answer).append(" sheep.").append("\n\n");
		}
		System.out.print(sb);
	}
}
