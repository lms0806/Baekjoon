import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), p = Integer.parseInt(st.nextToken()), q = Integer.parseInt(st.nextToken());
		
		int[] arra = new int[n], arrb = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arra[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arrb[i] = Integer.parseInt(st.nextToken());
		}
		
		System.out.print(solve(arra, arrb, p, q));
	}
	
	public static String solve(int[] arra, int[] arrb, int p, int q) {
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i = 0; i < arra.length; i++) {
			int a = arra[i], b = arrb[i];
			
			int count = 0;
			while(a != b) {
				a += p;
				b += q;
				count++;
				
				if(count == 10000) {
					return "NO";
				}
			}
			
			arr.add(count);
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append("YES").append("\n");
		for(int a : arr) {
			sb.append(a).append(" ");
		}
		return sb.toString();
	}
}
