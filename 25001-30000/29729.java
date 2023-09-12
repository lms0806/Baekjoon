import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int size = Integer.parseInt(st.nextToken()), t = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
		
		int nowSize = 0;
		while(t --> 0) {
			int num = Integer.parseInt(br.readLine());
			
			if(num == 1) {
				nowSize++;
				
				if(nowSize > size) {
					size *= 2;
				}
			}
			else {
				nowSize--;
			}
		}
		System.out.print(size);
	}
}
