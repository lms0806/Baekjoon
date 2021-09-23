import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		int[] num = new int[3];
		while(size --> 0) {
			String s = br.readLine();
			
			if(s.equals("1/4")) {
				num[0]++;
			}
			else if(s.equals("1/2")) {
				num[1]++;
			}
			else {
				num[2]++;
			}
		}
		
		int answer = num[1] / 2;
		num[1] -= answer * 2;// 1/2 계산
		
		int n = Math.min(num[0], num[2]); // 1/4와 3/4 계산
		num[0] -= n;
		num[2] -= n;
		answer += n;
		
		n = Math.min(num[0], num[1]);// 1/4와 1/2 계산
		num[0] -= n;
		num[1] -= n;
		answer += n;
		
		n = num[0] / 4;// 1/4 계산
		answer += n;
		num[0] -= n * 4;
		
		if(num[0] != 0) {
			answer++;
		}// 1/4 계산 후 남은 것(무조건 3보다 작음)
		
		answer += num[1] + num[2];
		
		System.out.print(answer);
	}
}
