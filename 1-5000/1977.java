import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		
		int sum = 0, num = 0, count = 0, number = 1;
		while(true) {
			if(number*number >= m && number*number <= n) {
				sum += number*number;
				count++;
				if(count == 1) {
					num = number*number;
				}
			}
			if(number*number > n) {
				break;
			}
			number++;
		}
		if(num == 0) {
			bw.write("-1");
		}
		else {
			bw.write(sum + "\n");
			bw.write(num + "\n");
		}
		bw.flush();

		br.close();
		bw.close();
	}
}
