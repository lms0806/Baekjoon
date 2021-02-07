import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < size; i++) {
			for(int j = size - i; j < size; j++) {
				sb.append(" ");
			}
			for(int j = size - i; j > 0; j--) {
				sb.append("*");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
