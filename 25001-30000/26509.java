import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			int[] a = new int[3], b = new int[3];
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i = 0; i < 3; i++) {
				a[i] = Integer.parseInt(st.nextToken());
			}
			
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < 3; i++) {
				b[i] = Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(a);
			Arrays.sort(b);
			
			sb.append(Arrays.equals(a, b) && a[0] * a[0] + a[1] * a[1] == a[2] * a[2] ? "YES" : "NO").append("\n");
		}
		System.out.print(sb);
	}
}
