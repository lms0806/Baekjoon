import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(size --> 0) {
			int n = Integer.parseInt(br.readLine());
			
			HashMap<String, Integer> map = new HashMap<>();
	
			while(n --> 0) {
				String s = br.readLine().split(" ")[1];
				
				map.put(s, !map.containsKey(s) ? 1 : map.get(s) + 1);
			} 
			
			int answer = 1;
	        for(int num : map.values()) {
	        	answer *= num + 1;
	        }
			
			sb.append(answer - 1).append("\n");
		}
		System.out.print(sb);
	}
}
