import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		int answer = 0, max = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		while(size --> 0) {
			int n = Integer.parseInt(st.nextToken());
			answer += n;
			if(max < n) {
				max = n;
			}
		}
		System.out.print(answer - max);
	}
}
