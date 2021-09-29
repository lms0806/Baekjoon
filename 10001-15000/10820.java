import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String str;
		StringBuilder sb = new StringBuilder();
		while((str = br.readLine()) != null) {
			int[] num = new int[4];

			for(char ch : str.toCharArray()) {
				if(ch >= 97 && ch <= 122) {
					num[0]++;
				}
				else if(ch >= 65 && ch <= 90) {
					num[1]++;
				}
				else {
					num[ch >= 48 && ch <= 57 ? 2 : 3]++;
				}
			}
			for(int i = 0; i < 4; i++) {
				sb.append(num[i]).append(" ");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
