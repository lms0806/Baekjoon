import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			int k = Integer.parseInt(br.readLine());
			
			HashSet<Integer> set = new HashSet<>();
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			while(k --> 0) {
				set.add(Integer.parseInt(st.nextToken()));
			}
			
			int n = Integer.parseInt(br.readLine());
			
			int answer = 0, min = Integer.MAX_VALUE, count = 0;
			while(n --> 0) {
				st = new StringTokenizer(br.readLine());
				int num = Integer.parseInt(st.nextToken());
				
				if(set.contains(num)) {
					int h = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
					
					if(h != -1 && m != -1) {
						int time = h * 60 + m;
						
						if(min > time) {
							min = time;
							answer = num;
						}
						
						if(time <= 360) {
							count++;
						}
					}
				}
			}
			
			sb.append(answer).append(" ").append(count).append("\n");
		}
		System.out.print(sb);
	}
}
