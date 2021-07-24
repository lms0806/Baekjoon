import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
			
			if(n == 0 && m == 0) {
				System.out.println(sb);
				break;
			}
			
			HashMap<Integer,Integer> map = new HashMap<>();
			
			int answer = 0;
			while(n --> 0) {
				map.put(Integer.parseInt(br.readLine()), 1);
			}
			
			while(m --> 0) {
				if(map.containsKey(Integer.parseInt(br.readLine()))) {
					answer++;
				}
			}
			sb.append(answer).append(" ");
		}
	}
}
