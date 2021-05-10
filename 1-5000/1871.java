import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(n --> 0) {
			String[] str = br.readLine().split("-");
			
			int num = 0;
			for(int i = 0; i < str[0].length(); i++) {
				num += (str[0].charAt(i)-65)*(int)(Math.pow(26, str[0].length()-i-1));
			}
			
			sb.append(Math.abs(num-Integer.parseInt(str[1])) <= 100 ? "nice" : "not nice").append("\n");
		}
		System.out.print(sb);
	}
}
