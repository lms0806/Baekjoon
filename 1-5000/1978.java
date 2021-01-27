import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());
		
		boolean istrue = true;
		
		int answer = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 1; i <= n; i++) {
			int num = Integer.parseInt(st.nextToken());
			istrue = true;
			
			istrue = sosu(num);
			
			if(istrue == true) {
				answer++;
			}
		}
		
		System.out.println(answer);
	}
	
	public static boolean sosu(int n) {
		if(n == 1) {
			return false;
		}
		else{
			for (int i = 2; i*i <= n; i++) {
				if (n % i == 0) {
					return false;
				}
			}
		}
		return true;
	}
}
