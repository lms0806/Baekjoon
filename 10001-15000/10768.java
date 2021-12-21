import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

		System.out.print(solve(Integer.parseInt(br.readLine()) * 30 + Integer.parseInt(br.readLine())));
	}
	
	public static String solve(int n) {
		return n == 78 ? "Special" : n > 78 ? "After" : "Before";
	}
}
