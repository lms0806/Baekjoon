import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		int s = 0, t = 0;
		while(size --> 0) {
			for(char ch : br.readLine().toLowerCase().toCharArray()) {
				if(ch == 's') {
					s++;
				}
				else if(ch == 't') {
					t++;
				}
			}
		}
		System.out.print(s < t ? "English" : "French");
	}
}
