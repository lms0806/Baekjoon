import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(n --> 0) {
            System.gc();
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int t = Integer.parseInt(st.nextToken());
			 
			TreeMap<Long, Integer> map = new TreeMap<>();
			
			long answer = 0;
			for(int i = 0; i < t; i++) {
				long a = Long.parseLong(st.nextToken());
				
				map.put(a, map.getOrDefault(a, 0) + 1);
				
				if(map.get(a) > t / 2) {
					answer = a;
					break;
				}
			}
			sb.append(answer == 0 ? "SYJKGW" : answer).append("\n");
		}
		System.out.print(sb);
	}
}
