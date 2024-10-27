import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> arr = new ArrayList<>();
		while(n > 0) {
			int num = n > 2 ? 3 : 2;
			
			arr.add(num);
			n -= num;
		}
		
		if(n < 0) {
			arr.remove(0);
			arr.add(2);
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append(arr.size()).append("\n");
		for(int a : arr) {
			sb.append(a).append(" ");
		}
		System.out.print(sb);
	}
}
