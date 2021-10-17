import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		br.readLine();
		System.out.print(solve(br.readLine()));
	}
	
	public static int solve(String s) {
		if(!s.contains("LL")) {
			return s.length();
		}
		int n = 1;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'L') {
				i++;
			}
			n++;
		}
		return n;
	}
}
