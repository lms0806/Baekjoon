import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(size --> 0) {
			String str = br.readLine().toLowerCase().replace(" ", "");
			
			int b = 0;
			for(char ch : str.toCharArray()) {
				if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					b++;
				}
			}
			
			sb.append(str.length() - b).append(" ").append(b).append("\n");
		}
		System.out.print(sb);
	}
}
