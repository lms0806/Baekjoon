import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String check = br.readLine();
		
		int size = Integer.parseInt(br.readLine());
		
		int answer = 0;
		while(size --> 0) {
			String str = br.readLine();
			str += str;
			if(str.contains(check)) {
				answer++;
			}
		}
		System.out.print(answer);
	}
}
