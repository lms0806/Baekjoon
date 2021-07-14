import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int[] num = new int[50];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < 50; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		
		int n = Integer.parseInt(br.readLine());
		
		int count = 1;
		for(int i = 0; i < 50; i++) {
			if(num[i] > n) {
				count++;
			}
		}
		
		if(count < 6) {
			System.out.print("A+");
		}
		else if(count < 16) {
			System.out.print("A0");
		}
		else if(count < 31) {
			System.out.print("B+");
		}
		else if(count < 36) {
			System.out.print("B0");
		}
		else if(count < 46) {
			System.out.print("C+");
		}
		else if(count < 49) {
			System.out.print("C0");
		}
		else {
			System.out.print("F");
		}
	}
}
