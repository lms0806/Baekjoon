import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String a = br.readLine();
		String b = br.readLine();
		
		int[] aa = new int[26];
		for(int j = 0; j < a.length(); j++) {
			aa[a.charAt(j) - 'a']++;
		}
		
		for(int j = 0; j < b.length(); j++) {
			aa[b.charAt(j) - 'a']--;
		}
		
		int answer = 0;
		for(int j = 0; j < aa.length; j++) {
			answer += Math.abs(aa[j]);
		}
		System.out.print(answer);
	}
}
