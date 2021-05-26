import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		int max = 0;
		String answer = "";
		while(size --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			int num = Integer.parseInt(st.nextToken());
			
			if(num > max) {
				max = num;
				answer = str;
			}
			else if(num == max && answer.compareTo(str) > 0) {
				answer = str;
			}
		}
		System.out.print(answer);
	}
}
