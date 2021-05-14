import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		StringBuilder sb = new StringBuilder();
		int count = 1;
		while(true) {
			String str = br.readLine();
			
			if(str.equals("Was it a cat I saw?")) {
				break;
			}
			
			for(int i = 0; i < str.length(); i+=count+1) {
					sb.append(str.charAt(i));
			}
			sb.append("\n");
			count++;
		}
		System.out.print(sb);
	}
}
