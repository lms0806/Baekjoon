import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[][] number = {{"***", "* *", "* *", "* *", "***"},
				{"  *", "  *", "  *", "  *", "  *"},
				{"***", "  *", "***", "*  ", "***"},
				{"***", "  *", "***", "  *", "***"},
				{"* *", "* *", "***", "  *", "  *"},
				{"***", "*  ", "***", "  *", "***"},
				{"***", "*  ", "***", "* *", "***"},
				{"***", "  *", "  *", "  *", "  *"},
				{"***", "* *", "***", "* *", "***"},
				{"***", "* *", "***", "  *", "***"}};
		
		String[] str = new String[5];
		
		for(int i = 0; i < 5; i++) {
			str[i] = br.readLine();
		}
		
		String answer = "";
		for(int i = 0; i < str[0].length(); i += 4) {
			String[] substr = new String[5];
			
			for(int j = 0; j < 5; j++) {
				substr[j] = str[j].substring(i, Math.min(i + 3, str[j].length()));
			}
			
			for(int j = 0; j < number.length; j++) {
				boolean check = true;
				for(int k = 0; k < 5; k++) {
					if(!substr[k].equals(number[j][k])) {
						check = false;
						break;
					}
				}
				
				if(check) {
					answer += j;
					break;
				}
			}
		}
		
		System.out.print(Integer.parseInt(answer) % 6 == 0 ? "BEER!!" : "BOOM!!");
	}
}
