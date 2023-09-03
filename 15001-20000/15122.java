import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());
		
		while(true) {
			n++;
			
			boolean flag = true;
			for(char c : String.valueOf(n).toCharArray()) {
				if(c == '0') {
					flag = false;
					break;
				}
			}
			
			if(flag) {
				break;
			}
		}
		
		System.out.print(n);
	}
}
