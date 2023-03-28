import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		char[] c = s.substring(0, Math.min(s.length(), 10)).toCharArray();
		
		String[] result = {"NLCS", "BHA", "KIS", "SJA"};
		String[] str = {"northlondo", "branksomeh", "koreainter", "stjohnsbur"};
		
		String answer = "";
		while(true) {
			for(int i = 0; i < 4; i++) {
				if(str[i].equals(new String(c))) {
					answer = result[i];
					break;
				}
			}
			
			if(!answer.equals("")) {
				break;
			}
			
			for(int i = 0; i < c.length; i++) {
				c[i]++;
				
				if(c[i] > 'z') {
					c[i] -= 26;
				}
			}
		}
		
		System.out.print(answer);
	}
}
