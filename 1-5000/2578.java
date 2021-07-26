import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[][] num;
	static int answer = 0;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

		num = new int[5][5];
		
		for(int i = 0; i < 5; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < 5; j++) {
				num[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int number = 0;
		for(int i = 0; i < 5; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < 5; j++) {
				number++;
				int n = Integer.parseInt(st.nextToken());
				for(int k = 0; k < 5; k++) {
					for(int l = 0; l < 5; l++) {
						if(num[k][l] == n) {
							num[k][l] = 0;
							n = 0;
							break;
						}
					}
					if(n == 0) {
						break;
					}
				}
				
				rcheck();
				ccheck();
				cross();
				
				if(answer >= 3) {
					System.out.print(number);
					break;
				}
				
				answer = 0;
			}
			if(answer >= 3) {
				break;
			}
		}
	}
	
	public static void rcheck() {
		for(int i = 0; i < 5; i++) {
			int count = 0;
			for(int j = 0; j < 5; j++) {
				if(num[i][j] == 0) {
					count++;
				}
			}
			if(count == 5) {
				answer++;
			}
		}
	}
	
	public static void ccheck() {
		for(int i = 0; i < 5; i++) {
			int count = 0;
			for(int j = 0; j < 5; j++) {
				if(num[j][i] == 0) {
					count++;
				}
			}
			if(count == 5) {
				answer++;
			}
		}
	}
	
	public static void cross() {
		int count = 0;
		for(int i = 0; i < 5; i++) {
			if(num[i][i] == 0) {
				count++;
			}
		}
		if(count == 5) {
			answer++;
		}
		
		count = 0;
		for(int i = 0; i < 5; i++) {
			if(num[i][4 - i] == 0) {
				count++;
			}
		}
		if(count == 5) {
			answer++;
		}
	}
}
