import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = br.readLine().split(":");
		int times = Integer.parseInt(str[0]) * 60 + Integer.parseInt(str[1]);
		
		int[] arr = new int[6];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < 6; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int t = Integer.parseInt(br.readLine());
		
		int count = 0;
		while(t --> 0) {
			st = new StringTokenizer(br.readLine());
			st.nextToken();
			
			String s = st.nextToken();
			char c = s.charAt(s.length() - 1);
			
			if(c == '^' && arr[times / 120] != 0) {
				count++;
				arr[times / 120] = 0;
				
				if(count == 6) {
					break;
				}
			}
			else if(c == 'N') {
				int num = Integer.parseInt(s.replace("MIN", ""));
				
				times += num;
			}
			else if(c == 'R') {
				int num = Integer.parseInt(s.replace("HOUR", ""));
				
				times += num * 60;
			}
			
			if(times >= 720) {
				times -= 720;
			}
		}
		
		int answer = 0;
		for(int a : arr) {
			answer += a;
		}
		System.out.print(Math.min(100, answer));
	}
}
