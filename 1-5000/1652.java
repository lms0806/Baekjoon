import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());
		
		char[][] ch = new char[n][n];
		
		for(int i = 0; i < n; i++) {
			ch[i] = br.readLine().toCharArray();
		}
		
		int count = 0, count1 = 0;
		for(int i = 0; i < n; i++) {
			boolean b = true, b1 = true;
			for(int j = 0; j < n - 1; j++) {
				if(ch[i][j] == 'X') {
					b = true;
				}
				else {
					if(b && ch[i][j + 1] == '.') {
						count++;
						b = false;
					}
				}
				
				if(ch[j][i] == 'X') {
					b1 = true;
				}
				else {
					if(b1 &&  ch[j + 1][i] == '.') {
						count1++;
						b1 = false;
					}
				}
			}
		}
		System.out.print(count + " " + count1);
	}
}
