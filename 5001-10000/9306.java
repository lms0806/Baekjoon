import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= size; i++) {
			String s = br.readLine();
			sb.append("Case ").append(i).append(": ").append(br.readLine()).append(", ").append(s).append("\n");
		}
		System.out.print(sb);
	}
}
