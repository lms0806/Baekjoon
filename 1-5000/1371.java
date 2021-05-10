import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int[] alph = new int[26];
		int max = 0;
		String str = "";
		while ((str = br.readLine()) != null) {
			for(int i = 0; i < str.length(); i++) {
				if(str.charAt(i) != ' ') {
					alph[str.charAt(i) - 'a']++;
					max = Math.max(max, alph[str.charAt(i) - 'a']);
				}
			}
		}
		for(int i = 0; i < alph.length; i++) {
			if(alph[i] == max) {
				System.out.println((char)(i + 'a'));
				break;
			}
		}
	}
}
