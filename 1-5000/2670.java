import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());

		Double[] num = new Double[size];
		
		double answer = Double.parseDouble(br.readLine());
        num[0] = answer;
		for(int i = 1; i < size; i++) {
			num[i] = Double.parseDouble(br.readLine());
			num[i] = Math.max(num[i - 1] * num[i], num[i]);
			answer = Math.max(answer, num[i]);
		}
		System.out.print(String.format("%.3f", answer));
	}
}
