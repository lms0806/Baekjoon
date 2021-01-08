import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int a = Integer.parseInt(br.readLine());
		
		
		if(a%5 == 0){
			System.out.println((a/5));
		}
		else {
			System.out.println((a/5)+1);
		}
	}
}
