import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		ArrayList<Integer> arr = new ArrayList<>(20);
		
		int num = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(num-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			if(str.equals("all")) {
				for(int j = 1; j < 21; j++) {
					if(!arr.contains(j)) {
						arr.add(j);
					}
				}
			}
			else if(str.equals("empty")) {
				arr.clear();
			}
			else {
				int number = Integer.parseInt(st.nextToken());
				if(str.charAt(0) == 'a' && !arr.contains(number)) {
					arr.add(number);
				}
				else if(str.charAt(0) == 'r' && arr.contains(number)) {
					arr.remove(arr.indexOf(number));
				}
				else if(str.charAt(0) == 'c') {
					sb.append(arr.contains(number) ? 1 : 0).append("\n");
				}
				else if(str.charAt(0) == 't') {
					if(arr.contains(number)) {
						arr.remove(arr.indexOf(number));
					}
					else {
						arr.add(number);
					}
				}
			}
		}
		System.out.print(sb);
	}
}
