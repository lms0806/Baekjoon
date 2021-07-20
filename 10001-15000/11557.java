import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(size --> 0) {
			int size1 = Integer.parseInt(br.readLine());
			
			int max = 0;
			String answer = "";
			while(size1 --> 0) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				String s = st.nextToken();
				int num = Integer.parseInt(st.nextToken());
				if(num > max) {
					answer = s;
					max = num;
				}
			}
			sb.append(answer).append("\n");
		}
		System.out.print(sb);
	}
}
