import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String str;
		StringBuilder sb = new StringBuilder();
		while((str = br.readLine()) != null) {
			int a = 0, b = 0, c = 0, d = 0;

			for(char ch : str.toCharArray()) {
				if(ch >= 97 && ch <= 122) {
					a++;
				}
				else if(ch >= 65 && ch <= 90) {
					b++;
				}
				else if(ch >= 48 && ch <= 57) {
					c++;
				}
				else {
					d++;
				}
			}
			sb.append(a).append(" ").append(b).append(" ").append(c).append(" ").append(d).append("\n");
		}
		System.out.print(sb);
	}
}
