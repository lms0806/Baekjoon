import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int num = Integer.parseInt(br.readLine());
		
		String str = "";
		for(int i = num; i >= 0; i--) {
			str = Integer.toString(i);
			
			int count = 0;
			for(int j = 0; j < str.length(); j++) {
				char ch = str.charAt(j);
				if(ch == '4' || ch == '7') {
					count++;
				}
			}
			if(count == str.length()) {
				break;
			}
		}
		System.out.println(str);
	}
}
