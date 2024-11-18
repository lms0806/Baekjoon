import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print(solve(Integer.parseInt(br.readLine()), Integer.parseInt(br.readLine()), Integer.parseInt(br.readLine())) ? "JAH" : "EI");
	}
	
	public static boolean solve(int a, int b, int c) {
		return (a == 1 || a == 3) && (b == 6 || b == 8) && (c == 2 || c == 5);
	}
}
