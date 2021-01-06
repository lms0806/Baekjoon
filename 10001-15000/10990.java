import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int size = Integer.parseInt(st.nextToken());
		
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size-i-1; j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			for(int j = 1; j < 2*i; j++) {
				System.out.print(" ");
			}
			if(i > 0) {
				System.out.println("*");
			}
			else {
				System.out.println();
			}
		}
	}
}
