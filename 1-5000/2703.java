import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(size --> 0) {
			String str = br.readLine();
			char[] c = br.readLine().toCharArray();
			
			for(char ch : str.toCharArray()) {
				sb.append(ch != ' ' ? c[ch - 'A'] : " ");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
