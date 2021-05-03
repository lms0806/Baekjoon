import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int size = Integer.parseInt(st.nextToken());
		int num = Integer.parseInt(st.nextToken());
		
		boolean[] boo = new boolean[size];
		
		for(int i = 0; i < num; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken())-1;
			int b = Integer.parseInt(st.nextToken());
			
			while(a < size) {
				boo[a] = true;
				a += b;
			}
		}
		
		int answer = 0;
		for(int i = 0; i < boo.length; i++) {
			if(boo[i] == false) {
				answer++;
			}
		}
		
		System.out.print(answer);
	}
}
