import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < size * 2; i++) {
			if(i % 2 == 0) {
				int n = size / 2 + (size % 2 == 1 ? 1 : 0);
				
				while(n --> 0) {
					sb.append("*").append(" ");
				}
			}
			else {
				int n = size / 2;
				while(n --> 0) {
					sb.append(" ").append("*");
				}
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
