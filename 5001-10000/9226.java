import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		String str = br.readLine();
		
		StringBuilder sb = new StringBuilder();
		while(!str.equals("#")) {
			int num = 0;
			for(int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);
				if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					num = i;
					break;
				}
			}
			
			sb.append(str.substring(num)).append(str.substring(0,num)).append("ay\n");
			str = br.readLine();
		}
		System.out.print(sb);
	}
}
