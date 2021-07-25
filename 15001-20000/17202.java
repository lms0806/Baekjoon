import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String a = br.readLine(), b = br.readLine();
		
		int[] num = new int[16];
		for(int i = 0; i < 8; i++) {
			num[i * 2] = a.charAt(i) - '0';
			num[i * 2 + 1] = b.charAt(i) - '0';
		}
		
		for(int i = 15; i > 1; i--) {
			for(int j = 0; j < i; j++) {
				num[j] = (num[j] + num[j + 1]) % 10;
			}
		}
		
		System.out.print(num[0] + "" + num[1]);
	}
}
