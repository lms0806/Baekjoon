import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size1 = Integer.parseInt(br.readLine());
		int[] num1 = new int[size1];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < size1; i++) {
			num1[i] = Integer.parseInt(st.nextToken());
		}
		
		int size2 = Integer.parseInt(br.readLine());
		int[] num2 = new int[size2];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < size2; i++) {
			num2[i] = Integer.parseInt(st.nextToken());
		}
		
		int[] answer = new int[size2];
		for(int i = 0; i < size2; i++) {
			for(int j = 0; j < size1; j++) {
				if(num2[i] == num1[j]) {
					answer[i] = 1;
					break;
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < size2; i++) {
			sb.append(answer[i]).append("\n");
		}
		System.out.print(sb);
	}
}
