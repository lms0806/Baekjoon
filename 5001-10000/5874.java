import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String str = br.readLine();
		
		int answer = 0, count = 0;
		for(int i = 1; i < str.length(); i++) {
			if(str.charAt(i-1) == '(' && str.charAt(i) == '(') {
				count++;//((의 갯수
			}
			if(str.charAt(i-1) == ')' && str.charAt(i) == ')') {
				answer += count;//((의 갯수에 따라 ))가 나올떄 그 갯수 더하기
			}
		}
		System.out.print(answer);
	}
}
