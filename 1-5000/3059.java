import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < size; i++) {
			int[] num = new int[26];
			String str = br.readLine();
			int answer = 0;
			for(int j = 0; j < str.length(); j++) {
				num[str.charAt(j) - 'A'] = 1;
			}
			
			for(int j = 0; j < num.length; j++) {
				if(num[j] == 0) {
					answer += j+65;
				}
			}
			sb.append(answer).append("\n");
		}
		System.out.println(sb);
	}
}
