import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int size = Integer.parseInt(st.nextToken());
		int max = Integer.parseInt(st.nextToken());
		
		int count = 0;
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < size; i++) {
			max -= Integer.parseInt(st.nextToken());
			if(max >= 0) {
				count++;
			}
			else {
				break;
			}
		}
		System.out.println(count);
	}
}
