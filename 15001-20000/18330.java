import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		System.out.print(solve(Integer.parseInt(br.readLine()), Integer.parseInt(br.readLine())));
	}
	
	public static int solve(int a, int b) {
		if(a <= b + 60) {
			return 1500 * a;
		}
		return (b + 60) * 1500 + (a - (b + 60)) *3000;
	}
}
