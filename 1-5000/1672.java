import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		br.readLine();
		char[] ch = br.readLine().toCharArray();
		char[][] chs = {{'A','C','A','G'},{'C','G','T','A'},{'A','T','C','G'},{'G','A','G','T'}};
		
		for(int i = ch.length - 1; i > 0; i--) {
			int n = ch[i] == 'A' ? 0 : ch[i] == 'G' ? 1 : ch[i] == 'C' ? 2 : 3;
			int n1 = ch[i-1] == 'A' ? 0 : ch[i-1] == 'G' ? 1 : ch[i-1] == 'C' ? 2 : 3;
			
			ch[i-1] = chs[n][n1];
		}
		System.out.print(ch[0]);
	}
}
