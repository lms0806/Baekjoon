import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int[] alpha = new int[26];
		for(char c : br.readLine().toCharArray()) {
			alpha[c - 'a']++;
		}
		
		boolean even = false, odd = false;
		for(int a : alpha) {
			if(a == 0) {
				continue;
			}
			else if(a % 2 == 0) {
				even = true;
			}
			else {
				odd = true;
			}
		}
		System.out.print(even && odd ? 2 : even ? 0 : 1);
	}
}
