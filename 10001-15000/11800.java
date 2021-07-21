import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		int n = size;
		String[] str = {"Yakk","Doh","Seh","Ghar","Bang","Sheesh"};
		
		StringBuilder sb = new StringBuilder();
		while(size --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			
			sb.append("Case ").append(n - size).append(": ");
			if(a == b) {
				if(a == 1) {
					sb.append("Habb Yakk");
				}
				else if(a == 2) {
					sb.append("Dobara");
				}
				else if(a == 3) {
					sb.append("Dousa");
				}
				else if(a == 4) {
					sb.append("Dorgy");
				}
				else if(a == 5) {
					sb.append("Dabash");
				}
				else {
					sb.append("Dosh");
				}
			}
			else if(Math.max(a, b) == 6 && Math.min(a, b) == 5) {
				sb.append("Sheesh Beesh");
			}
			else {
				sb.append(str[Math.max(a, b) - 1]).append(" ").append(str[Math.min(a, b) - 1]);
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
