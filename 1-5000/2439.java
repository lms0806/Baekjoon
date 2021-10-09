import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= size; i++) {
			sb.append(" ".repeat(size - i)).append("*".repeat(i)).append("\n");
		}
		System.out.print(sb);
	}
}
