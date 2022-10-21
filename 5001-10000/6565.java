import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	
		StringBuilder sb = new StringBuilder();
		while(true) {
			String s = br.readLine();
			
			String[] str = s.replaceAll("[+=]", " ").split(" ");
			
			for(int j = 0; j < str.length; j++) {
				str[j] = new StringBuilder(str[j]).reverse().toString();
			}
			
			sb.append(Integer.parseInt(str[0]) + Integer.parseInt(str[1]) == Integer.parseInt(str[2]) ? "True" : "False").append("\n");
			
			if(s.equals("0+0=0")) {
				break;
			}
		}
		System.out.print(sb);
	}
}
