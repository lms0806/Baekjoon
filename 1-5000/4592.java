import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			int num = 0;
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int size = Integer.parseInt(st.nextToken());
			
			if(size == 0) {
				break;
			}
			
			for(int i = 0; i < size; i++) {
				int number = Integer.parseInt(st.nextToken());
				if(num != number) {
					sb.append(number).append(" ");
					num = number;
				}
			}
			sb.append("$").append("\n");
		}
		System.out.print(sb);
	}
}
