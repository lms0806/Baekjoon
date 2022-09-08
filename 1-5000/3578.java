import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
 	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print(solve(Integer.parseInt(br.readLine())));
	}
 	
 	public static String solve(int n) {
 		if(n == 0) {
 			return "1";
 		}
 		else if(n == 1) {
 			return "0";
 		}
 		else if(n % 2 == 1) {
 			return "4" + print(n - 1);
 		}
 		return print(n);
 	}
 	
 	public static String print(int n) {
 		StringBuilder sb = new StringBuilder();
 		for(int i = 0; i < n / 2; i++) {
 			sb.append("8");
 		}
 		return sb.toString();
 	}
}
