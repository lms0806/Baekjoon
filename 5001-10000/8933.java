import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int k = Integer.parseInt(st.nextToken());
			String s = st.nextToken();
			
			int[] arr = new int[4];
			for(int i = 0; i < k; i++) {
				arr[check(s.charAt(i))]++;
			}
			
			int answer = 0;
			HashMap<Integer, Integer> map = new HashMap<>();
			map.put(change(arr), 1);
			for(int i = k; i < s.length(); i++) {
				arr[check(s.charAt(i - k))]--;
				arr[check(s.charAt(i))]++;
				
				int num = change(arr);
				map.put(num, map.getOrDefault(num, 0) + 1);
				
				answer = Math.max(answer, map.get(num));
			}
			sb.append(answer).append("\n");
		}
		System.out.print(sb);
	}
	
	public static int change(int[] arr) {
		return arr[0] + arr[1] * 60 + arr[2] * 60 * 60 + arr[3] * 60 * 60 * 60;
	}
	
	public static int check(char ch) {
		return ch == 'A' ? 0 : ch == 'C' ? 1 : ch == 'G' ? 2 : 3;
	}
}
