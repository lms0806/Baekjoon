import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		br.readLine();
		String str = br.readLine();
		
		int[] alpha = new int[26];
		for(int i = 0; i < str.length(); i++) {
			alpha[str.charAt(i)-97]++;
		}
		
		int answer = 0, num = 0;;
		for(int i = 0; i < alpha.length; i++) {
			if(answer < alpha[i]) {
				answer = alpha[i];
				num = i;
			}
		}
		
		System.out.println((char)(num+97) + " " + alpha[num]);
		
	}
}
