import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String str = br.readLine();
		
		int answer = 0;
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch >= 'A' && ch <= 'Z') {
				answer += (int)ch - 38;
			}
			else {
				answer += (int)ch - 96;
			}
		}
		
        StringBuilder sb = new StringBuilder();
		if(sosu(answer) || answer == 1) {
			sb.append("It is a prime word.").append("\n");
		}
		else {
			sb.append("It is not a prime word.").append("\n");
		}
        System.out.print(sb);
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
