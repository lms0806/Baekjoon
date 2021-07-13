import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			String str = br.readLine().toLowerCase();
			
			if(str.equals("#")) {
				break;
			}
			
			int count = 0;
			for(char ch : str.toCharArray()) {
				if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					count++;
				}
			}
			sb.append(count).append("\n");
		}
		System.out.print(sb);
	}
}
