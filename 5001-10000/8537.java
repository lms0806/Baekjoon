import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		int max = 0;
		while(size --> 0) {
			int[] alpha = new int[26];
			
			int num = 0;
			for(char ch : br.readLine().toCharArray()) {
				if(alpha[ch - 'a'] == 0) {
					alpha[ch - 'a']++;
					num++;
				}
			}
			max = Math.max(max, num);
		}
		System.out.print(max);
	}
}
