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
			int num = Integer.parseInt(br.readLine());
			
			int number = 0;
			String str = "";
			
			while(num --> 0) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int check = Integer.parseInt(st.nextToken());
				if(number < check) {
					str = st.nextToken();
					number = check;
				}
			}
			sb.append(str).append("\n");
		}
		System.out.print(sb);
	}
}
