import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		int num = 0;
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < size; i++) {
			num = Integer.parseInt(br.readLine());
			
			int result = 0;
			for(int j = 1; j <= num; j+=2) {
				result += j;
			}
			
			sb.append(result).append("\n");
		}
		System.out.print(sb);
	}
}
