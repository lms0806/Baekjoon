import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		boolean istrue = true;
		
		StringBuilder sb = new StringBuilder();
		while(n <= m) {
			istrue = true;
			
			istrue = sosu(n);
			
			if(istrue == true) {
				sb.append(n).append("\n";
			}
			n++;
		}
		
		System.out.println(sb);
	}
	
	public static boolean sosu(int n) {
		if(n == 1) {
			return false;
		}
		for (int i = 2; i*i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
