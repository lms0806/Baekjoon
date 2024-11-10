import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		int answer = 0;
		st = new StringTokenizer(br.readLine());
		PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> o1 % 10 == 0 ? o2 % 10 == 0 ? o1 - o2 : -1 : 1);
		while(n --> 0) {
			int num = Integer.parseInt(st.nextToken());
			
			if(num == 10) {
				answer++;
			}
			else if(num > 10) {
				pq.add(num);
			}
		}
		
		while(!pq.isEmpty() && m > 0) {
			int now = pq.poll();
			
			if(now < 10) {
				continue;
			}
			else if(now % 10 == 0) {
				int mod = now / 10 - 1;
				
				if(mod == 0) {
					answer++;
				}
				else {
					if(mod <= m) {
						m -= mod;
						answer += mod + 1;
					}
					else {
						answer += m;
						break;
					}
				}
			}
			else {
				int mod = now / 10;
				if(mod <= m) {
					m -= mod;
					answer += mod;
				}
				else {
					answer += m;
					break;
				}
			}
		}
		System.out.print(answer);
	}
}
