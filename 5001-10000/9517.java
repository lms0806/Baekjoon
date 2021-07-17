import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int num = Integer.parseInt(br.readLine());
		int size = Integer.parseInt(br.readLine());
		
		int nowtime = 0;
		while(size --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int time = Integer.parseInt(st.nextToken());
			String check = st.nextToken();
			
			if(time + nowtime > 210) {
				break;
			}
			
			if(check.equals("T")) {
				num++;
				if(num > 8) {
					num = 1;
				}
			}
			nowtime += time;
		}
		System.out.print(num);
	}
}
