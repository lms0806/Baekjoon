import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		long size = Long.parseLong(br.readLine());
		
		long answer = 0;
		while(size > 9) {
			long len = Long.toString(size).length();
			answer += (size - Math.pow(10, len - 1) + 1) * len;
			size = (long)Math.pow(10, len - 1) - 1;
		}
		answer += size;
		System.out.print(answer % 1234567);
	}
}
