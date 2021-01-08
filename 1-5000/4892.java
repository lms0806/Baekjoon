import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int a, i = 1;
		String str = "";
		
		while(true) {
			a = Integer.parseInt(br.readLine());
			
			if(a == 0) {
				break;
			}
			
			if(a % 2 == 0) {
				str = "even";
				a/=2;
			}
			else {
				str = "odd";
				a--;
				a/=2;
			}
			
			System.out.println(i + ". " + str + " " + a);
			i++;
		}
	}
}
