import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int[] num = new int[8];
		
		for(char ch : br.readLine().toCharArray()) {
			if(ch == '1' || ch == 'Q' || ch == 'A' || ch == 'Z') {
				num[0]++;
			}
			else if(ch == '2' || ch == 'W' || ch == 'S' || ch == 'X') {
				num[1]++;
			}
			else if(ch == '3' || ch == 'E' || ch == 'D' || ch == 'C') {
				num[2]++;
			}
			else if(ch == '4' || ch == '5' || ch == 'R' || ch == 'T' || ch == 'F' || ch == 'G' || ch == 'V' || ch == 'B') {
				num[3]++;
			}
			else if(ch == '6' || ch == '7' || ch == 'Y' || ch == 'U' || ch == 'H' || ch == 'J' || ch == 'N' || ch == 'M') {
				num[4]++;
			}
			else if(ch == '8' || ch == 'I' || ch == 'K' || ch == ',') {
				num[5]++;
			}
			else if(ch == '9' || ch == 'O' || ch == 'L' || ch == '.') {
				num[6]++;
			}
			else {
				num[7]++;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int n : num) {
			sb.append(n).append("\n");
		}
		System.out.print(sb);
	}
}
