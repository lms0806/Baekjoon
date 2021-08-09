import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int size = Integer.parseInt(br.readLine());
		
		String str = "[A-F]?A+F+C+[A-F]?$";
		
		StringBuilder sb = new StringBuilder();
		while(size --> 0) {
			sb.append(br.readLine().matches(str) ? "Infected!" : "Good").append("\n");
		}
		System.out.print(sb);
	}
}
