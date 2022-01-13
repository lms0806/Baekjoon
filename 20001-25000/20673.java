import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		System.out.print(solve(Integer.parseInt(br.readLine()), Integer.parseInt(br.readLine())));
	}
	
	public static String solve(int a, int b) {
		return a <= 50 && b <= 10 ? "White" : b > 30 ? "Red" : "Yellow";
	}
}
