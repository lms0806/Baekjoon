import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			String[] s = br.readLine().split(",");
			
			HashMap<String, Integer> map = new HashMap<>();
			for(int i = 0; i < s.length; i++) {
				String[] str = s[i].split(":");
				
				map.put(str[0], Integer.parseInt(str[1]));
			}
			
			s = br.readLine().split("\\|");
			int answer = Integer.MAX_VALUE;
			for(int i = 0; i < s.length; i++) {
				String[] str = s[i].split("&");
				
				int num = 0;
				for(String strs : str) {
					num = Math.max(num, map.get(strs));
				}
				
				answer = Math.min(answer, num);
			}
			sb.append(answer).append("\n");	
		}
		System.out.print(sb);
	}
}
