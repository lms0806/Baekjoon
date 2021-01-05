import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int a = Integer.parseInt(br.readLine());
		
		br.close();
		
		int count = 2;
		while(a >= count) {
			if(a%count == 0) {
				a/=count;
				System.out.println(count);
			}
			else {
				count++;
			}
		}
	}
}
