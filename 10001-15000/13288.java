import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String str = br.readLine().toLowerCase();
		String[] s = {"@","8","(","|)","3","#","6","[-]","|","_|","|<","1","[]\\/[]","[]\\[]","0","|D","(,)","|Z","$","']['","|_|","\\/","\\/\\/","}{","`/","2"};
		
		StringBuilder sb = new StringBuilder();
		for(char ch : str.toCharArray()) {
			sb.append(ch >= 'a' && ch <= 'z' ? s[ch - 'a'] : ch);
		}
		System.out.print(sb);
	}
}
