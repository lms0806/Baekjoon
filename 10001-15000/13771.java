import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		int size = Integer.parseInt(br.readLine());
		
		double[] num = new double[size];
		
		for(int i = 0; i < size; i++) {
			num[i] = Double.parseDouble(br.readLine());
		}
		
		Arrays.sort(num);
		
		System.out.print(String.format("%.2f", num[1]));
	}
}
