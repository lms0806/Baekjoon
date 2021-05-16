import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= size; i++) {
			String str = br.readLine();
			
			int[] alpha = new int[26];
			for(int j = 0; j < str.length(); j++) {
				char ch = str.charAt(j);
				
				if(ch >= 'a' && ch <= 'z') {
					alpha[ch - 'a']++;
				}
				else if(ch >= 'A' && ch <= 'Z') {
					alpha[ch - 'A']++;
				}
			}
			
			int num = 3;
			sb.append("Case ").append(i).append(": ");
			for(int j = 0; j < alpha.length; j++) {
				num = Math.min(num, alpha[j]);
				if(num == 0) {
					break;
				}
			}
			sb.append(num == 0 ? "Not a pangram" : num == 1 ? "Pangram!" : num == 2 ? "Double pangram!!" : "Triple pangram!!!").append("\n");
		}
		System.out.print(sb);
	}
}
