import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String s = br.readLine(), str = br.readLine();
		
		int answer = 0, idx = 0;
		while(idx != str.length()) {
			for(char c : s.toCharArray()) {
				if(c == str.charAt(idx)) {
					idx++;
					
					if(idx == str.length()) {
						break;
					}
				}
			}
			answer++;
		}
		System.out.print(answer);
	}
}
