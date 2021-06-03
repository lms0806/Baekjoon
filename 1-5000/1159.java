import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int[] num = new int[26];
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(size --> 0) {
			char ch = br.readLine().charAt(0);
			num[ch - 'a']++;
		}
		
		for(int i = 0; i < num.length; i++) {
			if(num[i] >= 5) {
				sb.append((char)(i + 97));
			}
		}
		System.out.print(sb.length() == 0 ? "PREDAJA" : sb);
	}
}
