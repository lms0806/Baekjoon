import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String s = br.readLine();
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < s.length(); i++) {
			int num = s.charAt(i);
			
			int count = 0;
			while(num != 0) {
				count += num%10;
				num/=10;
			}
			for(int j = 0; j < count; j++) {
				sb.append(s.charAt(i));
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
