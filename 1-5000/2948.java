import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int b = Integer.parseInt(st.nextToken());
		int a = Integer.parseInt(st.nextToken());
		
		String[] day = {"Wednesday","Thursday","Friday","Saturday","Sunday","Monday","Tuesday"};
		for(int i = 1; i < a; i++) {
			if(i == 2) {
				b+=28;
			}
			else if(i == 4 || i == 6 || i == 9 || i ==11) {
				b+=30;
			}
			else{
				b+=31;
			}
		}
		b %= 7;
		System.out.print(day[b]);
	}
}
