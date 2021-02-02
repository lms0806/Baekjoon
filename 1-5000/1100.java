import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int answer = 0;
		String str = "";
		for(int i = 0; i < 8; i++) {
			str = br.readLine();
			for(int j = 0; j < 8; j++) {
				if(i == j || (i-j)%2 == 0) {
					if(str.charAt(j) == 'F') {
						answer++;
					}
				}
			}
		}
		System.out.println(answer);
	}
}
