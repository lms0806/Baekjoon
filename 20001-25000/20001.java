import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		br.readLine();
		String str = br.readLine();
		
		int num = 0;
		while(!str.equals("고무오리 디버깅 끝")) {
			num += str.equals("문제") ? -1 : num == 0 ? -2 : 1;
			
			str = br.readLine();
		}
		
		System.out.print(num < 0 ? "힝구" : "고무오리야 사랑해");
	}
}
