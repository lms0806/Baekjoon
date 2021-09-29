import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = 1;
		StringBuilder sb = new StringBuilder();
		for(char ch : br.readLine().toCharArray()) {
			sb.append(ch);
			if(n % 10 == 0) {
				sb.append("\n");
			}
			n++;
		}
		System.out.print(sb);
	}
}
