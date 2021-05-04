import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String str = br.readLine();
		
		if(Integer.parseInt(str) < 10) {
			System.out.print(0);
		}
		else {
			int count = 0;
			while(Integer.parseInt(str) >= 10) {
				int num = 1;
				for(int i = 0; i < str.length(); i++) {
					num *= Integer.parseInt(str.substring(i,i+1));
				}
				str = Integer.toString(num);
				count++;
			}
			System.out.println(count);
		}
	}
}
