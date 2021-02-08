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
			
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			
			if(n == 0 && m == 0) {
				break;
			}
			
			HashMap<Integer,Integer> map = new HashMap<>();
			int num = 0;
			int answer = 0;
			
			for(int i = 0; i < n; i++) {
				num = Integer.parseInt(br.readLine());
				map.put(num, 1);
			}
			
			for(int i = 0; i < m; i++) {
				num = Integer.parseInt(br.readLine());
				if(map.containsKey(num)) {
					answer++;
				}
			}
			sb.append(answer).append(" ");
		}
		System.out.println(sb);
	}
}
