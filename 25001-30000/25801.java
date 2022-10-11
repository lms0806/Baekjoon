import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int[] alpha = new int[26];
		
		for(char c : br.readLine().toCharArray()) {
			alpha[c - 'a']++;
		}
		
		boolean flag = false, flag1 = false;
		for(int i = 0; i < alpha.length; i++) {
			if(alpha[i] == 0) {
				continue;
			}
			if(alpha[i] % 2 == 0) {
				flag = true;
			}
			else {
				flag1 = true;
			}
		}
		
		System.out.print(flag && flag1 ? "0/1" : flag ? 0 : 1);
	}
}
