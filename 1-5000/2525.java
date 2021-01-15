import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(br.readLine());
		
		b += c;
		while(b >= 60) {
			b-=60;
			a+=1;
			if(a >=24) {
				a -= 24;
			}
		}
		
		System.out.println(a + " " + b);
	}
}
