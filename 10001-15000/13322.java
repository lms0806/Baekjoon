import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < s.length(); i++) {
			sb.append(i).append("\n");
		}
		System.out.print(sb);
	}
}
