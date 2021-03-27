import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String str = br.readLine();
		int num = 0;
		if(str.equals("고무오리 디버깅 시작")) {
			while(true) {
				str = br.readLine();
				if(str.equals("고무오리 디버깅 끝")) {
					break;
				}
				else if(str.equals("문제")) {
					num--;
				}
				else if(str.equals("고무오리")) {
					if(num == 0) {
						num-=2;
					}
					else {
						num++;
					}
				}
			}
		}
		
		System.out.print(num < 0 ? "힝구" : "고무오리야 사랑해");
	}
}
