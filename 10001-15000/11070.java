import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
			
			long[] plus = new long[n], minus = new long[n];
			while(m --> 0) {
				st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken()) - 1, b = Integer.parseInt(st.nextToken()) - 1;
				long scoreA = Long.parseLong(st.nextToken()), scoreB = Long.parseLong(st.nextToken()); 
						
				plus[a] += scoreA;
				minus[a] += scoreB;
				
				plus[b] += scoreB;
				minus[b] += scoreA;
			}
			
			long min = Long.MAX_VALUE, max = Long.MIN_VALUE;
			for(int i = 0; i < n; i++) {
				long num = plus[i] * plus[i] + minus[i] * minus[i] == 0 ? 0 : plus[i] * plus[i] * 1000 / (plus[i] * plus[i] + minus[i] * minus[i]);
				
				max = Math.max(max, num);
				min = Math.min(min, num);
			}
			sb.append(max).append("\n").append(min).append("\n");
		}
		System.out.print(sb);
	}
}
