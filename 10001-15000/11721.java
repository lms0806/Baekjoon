import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String str = br.readLine();
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= str.length(); i++) {
			sb.append(str.charAt(i-1));
            if(i % 10 ==  0) {
                sb.append("\n");
            }
		}
		System.out.print(sb);
	}
}
