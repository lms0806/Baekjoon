import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int a = Integer.parseInt(br.readLine()), b = Integer.parseInt(br.readLine());
		
		int count = 0;
		while(a != b) {
			if(++a == 360) {
				a = 0;
			}
			count++;
		}
		
		System.out.print(count <= 180 ? count : "-" + (360 - count));
	}
}
