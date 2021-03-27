import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String line;
		StringBuilder sb = new StringBuilder();
		while((line = br.readLine()) != null) {
			sb.append(line).append("\n");
		}
		System.out.print(sb);
	}
}
