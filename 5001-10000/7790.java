import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	
		String str;
		int answer = 0;
		while((str = br.readLine()) != null) {
			for(int i = 0; i < str.length()-3; i++) {
				if(str.substring(i,i+4).equals("joke")) {
					answer++;
				}
			}
		}
		System.out.print(answer);
	}
}
