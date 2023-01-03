import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print(solve(Long.parseLong(br.readLine())));;
	}
	
	public static long solve(long n) {
		if(n < 10) {
			return n;
		}
		
		int count = String.valueOf(n).length() - 1;
		
		return (long)(Math.round(n / (Math.pow(10, count))) * Math.pow(10, count));
	}
}
