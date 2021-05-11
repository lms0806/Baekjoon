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
			
			for(int i = str.length()-1; i >= 0; i--) {
				sb.append(str.charAt(i));
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
