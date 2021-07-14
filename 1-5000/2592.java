import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int[] num = new int[101];
		
		int avg = 0;
		for(int i = 0; i < 10; i++) {
			int n = Integer.parseInt(br.readLine());
			avg += n;
			num[n / 10]++;
		}
		
		int many = 0, manycheck = 0, count = 0;
		for(int i = 0; i < num.length; i++) {
			if(manycheck < num[i]) {
				many = i * 10;
				manycheck = num[i];
			}
			
			count += num[i];
			
			if(count == 10) {
				break;
			}
		}
		System.out.print(avg / 10 + "\n" + many);
	}
}
