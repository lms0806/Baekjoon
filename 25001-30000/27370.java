import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{ 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			long suma = 0, sumb = 0;
			
			ArrayList<Integer> arr = new ArrayList<>();
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < n; i++) {
				int num = Integer.parseInt(st.nextToken());
				
				int difa = Math.abs(num - a) << 1, difb = Math.abs(num - b) << 1;
				
				if(difa < difb) {
					suma += difa;
				}
				else if(difa > difb) {
					sumb += difb;
				}
				else {
					arr.add(num);
				}
			}
			
			for(int ar : arr) {
				if(suma < sumb) {
					suma += Math.abs(ar - a) << 1;
				}
				else {
					sumb += Math.abs(ar - b) << 1;
				}
			}
			
			sb.append(suma + sumb).append(" ").append(Math.abs(suma - sumb)).append("\n");
		}
		System.out.print(sb);
	}
}
