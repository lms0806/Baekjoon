import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= size; i++) {
			sb.append("Data Set ").append(i).append(":");
			int count = Integer.parseInt(br.readLine());
			
			for(char ch : br.readLine().toCharArray()) {
				count += ch == 'c' ? 1 : -1;
			}
			sb.append("\n").append(count).append("\n\n");
		}
		System.out.print(sb);
	}
}
