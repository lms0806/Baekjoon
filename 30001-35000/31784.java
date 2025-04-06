import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
		
		char[] ch = br.readLine().toCharArray();
		
		for(int i = 0; i < ch.length; i++) {
			if(i == ch.length - 1 && k != 0) {
				k %= 26;
				
				ch[i] += k;
				
				if(ch[i] > 'Z') {
					ch[i] -= 26;
				}
			} 
			else if(ch[i] == 'A') {
				continue;
			}
			else if(ch[i] + k > 'Z') {
				k -= 'Z' - ch[i] + 1;
				ch[i] = 'A';
			}
		}
		System.out.print(ch);
	}
}
