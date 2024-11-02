import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int test = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int t = 1; t <= test; t++) {
			HashSet<Integer> set = new HashSet<>();
			int num = Integer.parseInt(br.readLine());
			
			int number = num;
			boolean flag = false;
			for(int i = 0; i < 200; i++) {
				int temp = number;
				
				while(temp != 0) {
					set.add(temp % 10);
					temp /= 10;
				}
				
				if(set.size() == 10) {
					flag = true;
					break;
				}
				
				number += num;
			}
			
			
			sb.append("Case #").append(t).append(": ").append(flag ? number : "INSOMNIA").append("\n");
		}
		System.out.print(sb);
	}
}
