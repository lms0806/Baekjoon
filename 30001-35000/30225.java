import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int t = Integer.parseInt(br.readLine());
		
		int time = 0;
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int num = Integer.parseInt(st.nextToken()), arrive = Integer.parseInt(st.nextToken());
			int process = Integer.parseInt(st.nextToken()), leave = Integer.parseInt(st.nextToken());
			
			if(time <= arrive + leave) {
				time = Math.max(time, arrive);
				
				time += process;
				sb.append(num).append("\n");
			}
		}
		System.out.print(sb);
	}
}
