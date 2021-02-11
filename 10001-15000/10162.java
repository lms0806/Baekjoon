import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int a = 300;
		int b = 60;
		int c = 10;
		
		int num = Integer.parseInt(br.readLine());
		
		int count1 = 0, count2 = 0, count3 = 0;
		
		while(num != 0) {
			if(num >= a) {
				num-=a;
				count1++;
			}
			else if(num >= b) {
				num-=b;
				count2++;
			}
			else if(num >= c) {
				num-=c;
				count3++;
			}
			else {
				num = -1;
				break;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		if(num == -1) {
			sb.append("-1");
		}
		else {
			sb.append(count1).append(" ").append(count2).append(" ").append(count3);
		}
		System.out.print(sb);
	}
}
