import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int choice = Integer.parseInt(st.nextToken());
			
			if(choice == 1) {
				int x = Integer.parseInt(st.nextToken()), w = Integer.parseInt(st.nextToken());
				
				map.put(w, x);
			}
			else {
				sb.append(map.get(Integer.parseInt(st.nextToken()))).append("\n");
			}
		}
		System.out.print(sb);
	}
}
