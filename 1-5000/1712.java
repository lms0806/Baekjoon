import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		int a, b, c;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		a = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		
        StringBuilder sb = new StringBuilder();
		if(b >= c) {
			sb.append(-1);
		}
		else {
			int count = a/(c-b) + 1;
			sb.append(count);
		}
        System.out.print(sb);
	}
}
