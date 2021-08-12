import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int a = 1, b = 1;
		int size = Integer.parseInt(br.readLine());
		
		boolean c = false;
		while(size --> 1) {
			if(!c) {
				if(a != 1) {
					a--;
				}
				else {
					c = true;
				}
				b++;
			}
			else {
				if(b != 1) {
					b--;
				}
				else {
					c = false;
				}
				a++;
			}
		}
		System.out.print(a + "/" + b);
	}
}
