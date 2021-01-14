import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int num = Integer.parseInt(st.nextToken());
		num += Integer.parseInt(st.nextToken());
		int size = Integer.parseInt(st.nextToken());
		
		int answer = 0, number = 0;
		while(num >= size) {
			number = num/size;
			answer += number;
			num = number + (num%size);
		}
		
		System.out.println(answer);
	}
}
