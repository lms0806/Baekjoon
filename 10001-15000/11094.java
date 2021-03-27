import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		String str;
		StringBuilder sb = new StringBuilder();
		while(size --> 0) {
			str = br.readLine();
			if(str.startsWith("Simon says")) {
				sb.append(str.substring(10)).append("\n");
			}
		}
		System.out.print(sb);
	}
}
