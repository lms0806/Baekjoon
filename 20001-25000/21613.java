import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		String answer = "";
		int max = 0;
		
		while(t --> 0) {
			String s = br.readLine();
			int num = Integer.parseInt(br.readLine());
			
			if(max < num) {
				max = num;
				answer = s;
			}
		}
		System.out.print(answer);
	}
}
