import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		HashMap<String, String> map = new HashMap<>();
		
		int size = Integer.parseInt(br.readLine());
		
		while(size --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " = ");
			map.put(st.nextToken(), st.nextToken());
		}
		
		size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(size --> 0) {
			br.readLine();
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			while(st.hasMoreTokens()) {
				sb.append(map.get(st.nextToken())).append(" ");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
