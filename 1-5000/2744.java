import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String str = br.readLine();
		
		String answer = "";
		for(int i = 0; i < str.length(); i++) {
			if(Character.isUpperCase(str.charAt(i)) == true) {
				answer += str.substring(i,i+1).toLowerCase();
			}
			else if(Character.isLowerCase(str.charAt(i)) == true) {
				answer += str.substring(i,i+1).toUpperCase();
			}
		}
		System.out.println(answer);
	}
}
