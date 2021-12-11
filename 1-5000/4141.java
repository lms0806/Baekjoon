import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			String s = "";
			for(char c : br.readLine().toUpperCase().toCharArray()) {
				if(c <= 'C') {
					s += "2";
				}
				else if(c <= 'F') {
					s += "3";
				}
				else if(c <= 'I') {
					s += "4";
				}
				else if(c <= 'L') {
					s += "5";
				}
				else if(c <= 'O') {
					s += "6";
				}
				else if(c <= 'S') {
					s += "7";
				}
				else if(c <= 'V') {
					s += "8";
				}
				else {
					s += "9";
				}
			}
			
			sb.append(s.equals(new StringBuilder(s).reverse().toString()) ? "YES" : "NO").append("\n");
		}
		System.out.print(sb);
	}
}
