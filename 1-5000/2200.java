import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int answer = 1;
		st.nextToken(); //첫수는 무조건 계수 1
		for(int i = 0; i < size; i++) {
			String s = st.nextToken();
			
			if(!s.equals("0")) {
				answer++;
				answer += s.length();
			}
			
			if(i != size - 1) {
				answer += 2;
			}//마지막 수
		}
		answer++;
		
		System.out.print(answer);
	}
}
