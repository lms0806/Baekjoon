import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String str = br.readLine();
		
		int answer = 0, count = 0;
		for(int i = 0; i < str.length()-2; i++) {
			if(str.charAt(i) == ':' && str.charAt(i+1) == '-') {
				if(str.charAt(i+2) == ')') {
					answer++;
				}
				else if(str.charAt(i+2) == '(') {
					answer--;
				}
				count++;
			}
		}
        
		System.out.print(count == 0 ? "none" : answer < 0 ? "sad" : answer == 0 ? "unsure" : "happy");
	}
}
