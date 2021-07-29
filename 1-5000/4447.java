import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		String str = "";
		StringBuilder sb = new StringBuilder();
		while(size --> 0){
			str = br.readLine();
			
			int g = 0, b = 0;
			for(char ch : str.toLowerCase().toCharArray()) {
				if(ch == 'g') {
					g++;
				}
				else if(ch == 'b') {
					b++;
				}
			}
			sb.append(str).append(" is ");
			if(g == b) {
				sb.append("NEUTRAL");
			}
			else {
				sb.append(g > b ? "GOOD" : "A BADDY");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
