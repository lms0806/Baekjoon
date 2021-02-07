import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		double[] num = new double[size];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < size; i++) {
			num[i] = Double.parseDouble(st.nextToken());
		}
		
		Arrays.sort(num);
		
		double max = num[size-1];
		
		double sum = 0;
		for(int i = 0; i < size; i++) {
			sum += num[i] / max * 100;
		}
		System.out.println(sum/size);
	}
}
