import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringBuilder sb  =new StringBuilder();
		while(true) {
			String s = br.readLine();
			
			if("#".equals(s)) {
				break;
			}
			
			int answer = 0;
			while(true) {
				String[] str = s.split(" ");
				
				double num = Double.parseDouble(str[str.length - 2]);
				
				answer += "F".equals(str[str.length - 1]) ? num * 2 : "B".equals(str[str.length - 1]) ? num + Math.ceil(num / 2) : Math.max(num, 500);
				
				s = br.readLine();
				
				if("0".equals(s)) {
					sb.append(answer).append("\n");
					break;
				}
			}
		}
		System.out.print(sb);
	}
}
