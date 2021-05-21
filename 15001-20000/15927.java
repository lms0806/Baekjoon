import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	
		System.out.print(solve(br.readLine()));
	}
	
	public static int solve(String str) {
		int n = 0;
		for(int i = 1; i < str.length(); i++) {
			if(str.charAt(0) == str.charAt(i)) {
				n++;
			}
			else {
				break;
			}
		}
		if(n == str.length()-1) {
			return -1;
		}
		
		for(int i = 0; i < str.length()/2; i++) {
			if(str.charAt(i) != str.charAt(str.length()-i-1)) {
				return str.length();
			}
		}
		
		return str.length()-1;
	}
}
