import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		char[] c = br.readLine().toCharArray();
		
		int w = 0, m = 0, answer = 0;
		for(int i = 0; i < c.length; i++) {
			if(Math.abs(m - w) < n) {
				if(c[i] == 'W') {
					w++;
				}
				else {
					m++;
				}
				
				answer++;
			}
			else {
				if(c[i] == 'M') {
					if(Math.abs(m + 1 - w) < n){
						m++;
						answer++;
					}
					else {
						if(i + 1 < c.length && c[i + 1] == 'W') {
							char ch = c[i];
							c[i] = c[i + 1];
							c[i + 1] = ch;
							
							w++;
							answer++;
						}
						else {
							break;
						}
					}
				}
				else {
					if(Math.abs(w + 1 - m) < n) {
						w++;
						answer ++;
					}
					else {
						if(i + 1 < c.length && c[i + 1] == 'M') {
							char ch = c[i];
							c[i] = c[i + 1];
							c[i + 1] = ch;
							
							m++;
							answer++;
						}
						else {
							break;
						}
					}
				}
			}
		}
		System.out.print(answer);
	}
}
