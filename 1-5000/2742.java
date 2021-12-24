import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine()) + 1;
		
		StringBuilder sb = new StringBuilder();
		while(size --> 1) {
			sb.append(size).append("\n");
		}
		System.out.print(sb);
	}
}
