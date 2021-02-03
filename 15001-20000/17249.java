import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String str = br.readLine();
		
		int check = 0;
		int left = 0, right = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == '@') {
				if(check == 0) {
					left++;
				}
				else {
					right++;
				}
			}
			if(str.charAt(i) == '(') {
				check = 1;
			}
		}
		System.out.println(left + " " + right);
	}
}
