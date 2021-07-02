import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		String answers = "";
		int answer = 0, max = 0;
		while(size --> 0) {
			String str = br.readLine();
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			
			int count = 0;
			while(a <= b) {
				b = b - a + 2;
				count++;
			}
			
			if(max < count) {
				answers = str;
				max = count;
			}
			
			answer += count;
		}
		System.out.print(answer + "\n" + answers);
	}
}
