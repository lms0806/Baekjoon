import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			int num = Integer.parseInt(st.nextToken());
			
			if(name.equals("#") && num == 0) {
				break;
			}
			
			while(true) {
				st = new StringTokenizer(br.readLine());
				char c = st.nextToken().charAt(0);
				int number = Integer.parseInt(st.nextToken());
				
				if(c == 'X' && number == 0) {
					break;
				}
				
				if(c == 'B') {
					if(num + number <= 68) {
						num += number;
					}
				}
				else {
					if(num >= number) {
						num -= number;
					}
				}
			}
			
			sb.append(name).append(" ").append(num).append("\n");
		}
		System.out.print(sb);
	}
}
