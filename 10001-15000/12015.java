import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		int[] num = new int[size + 1];
		
		int count = 1;
		StringTokenizer st = new StringTokenizer(br.readLine());
		while(size --> 0) {
			int value = Integer.parseInt(st.nextToken());
			if(value > num[count - 1]) {
				num[count++] = value;
			}
			else {
				int index = Arrays.binarySearch(num, 0, count, value);
				if(index < 0) {
					index = -(index + 1);
				}
				num[index] = value;
			}
		}
		System.out.print(count - 1);
	}
}
