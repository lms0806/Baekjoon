import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		int max = 0, n = 0;
		for(int i = 1; i <= size; i++) {
			int a = size, b = i;
			int count = 2;
			while(a >= 0) {
				int temp = a - b;
				a = b;
				b = temp;
				count++;
			}
			if(max < count) {
				max = count;
				n = i;
			}
		}
		
		ArrayList<Integer> arr = new ArrayList<>();
		while(size >= 0) {
			arr.add(size);
			
			int temp = size - n;
			size = n;
			n = temp;
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append(arr.size()).append("\n");
		for(int num : arr) {
			sb.append(num).append(" ");
		}
		System.out.print(sb);
	}
}
