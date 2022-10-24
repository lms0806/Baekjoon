import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= t; i++) {
			sb.append("Test case #").append(i).append(":\n");
			int n = Integer.parseInt(br.readLine());
			
			char[] a = new char[n], b = new char[n];
			for(int j = 0; j < n; j++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				a[j] = st.nextToken().charAt(0);
				b[j] = st.nextToken().charAt(0);
			}
			
			n = Integer.parseInt(br.readLine());
			
			while(n --> 0) {
				char[] c = br.readLine().toCharArray();
				String str = new String(c);
				
				for(int j = 0; j < c.length; j++) {
					for(int k = 0; k < a.length; k++) {
						if(c[j] == a[k]) {
							c[j] = b[k];
							break;
						}
					}
				}
				
				String s = new String(c);
				sb.append(str).append(" ").append(s.equals(new StringBuilder(s).reverse().toString()) ? "YES" : "NO").append("\n");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
