import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		int[] num = new int[26];
		while(size --> 0) {
			num[br.readLine().charAt(0) - 'a']++;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < num.length; i++) {
			if(num[i] >= 5) {
				sb.append((char)(i + 'a'));
			}
		}
		System.out.print(sb.length() == 0 ? "PREDAJA" : sb);
	}
}
