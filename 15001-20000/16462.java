import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		double sum = 0;
		for(int i = 0; i < size; i++) {
			String str = br.readLine();
			
			String answer = "";
			for(int j = 0; j < str.length(); j++) {
				answer += str.charAt(j) == '0' || str.charAt(j) == '6' ? "9" : str.charAt(j);
			}
			double num = Double.parseDouble(answer);
			if(num > 100) {
				num = 100;
			}
			sum += num;
		}
		sum/=size;
		
		if(sum >= (int)sum + 0.5) {
			sum++;
		}
		
		System.out.print((int)sum);
	}
}
