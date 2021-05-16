import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String[] str = br.readLine().split("What");
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < str.length; i++) {
			if(str[i].contains("?")) {
				sb.append("Forty-two").append(str[i].substring(0,str[i].indexOf("?"))).append(".").append("\n");
			}
		}
		System.out.print(sb);
	}
}
