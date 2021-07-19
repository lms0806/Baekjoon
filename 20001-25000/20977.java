import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		br.readLine();
		
		char[] ch = br.readLine().toCharArray();
		
		char[] chs = {'J','O','I'};
		int count = 0, num = 0;
		StringBuilder sb = new StringBuilder();
		while(count != ch.length) {
			for(int i = 0; i < ch.length; i++) {
				if(ch[i] == chs[num]) {
					sb.append(ch[i]);
					count++;
				}
			}
			num++;
		}
		System.out.print(sb);
	}
}
