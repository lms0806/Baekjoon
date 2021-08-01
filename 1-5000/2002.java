import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int size = Integer.parseInt(br.readLine());
		
		ArrayList<String> arr = new ArrayList<>();
		int[] num = new int[size];
		
		for(int i = 0; i < size; i++) {
			arr.add(br.readLine());
		}
		
		for(int i = 0; i < size; i++) {
			num[i] = arr.indexOf(br.readLine());
		}
		
		int answer = 0;
		for(int i = 0; i < num.length - 1; i++) {
			for(int j = i + 1; j < num.length; j++) {
				if(num[i] > num[j]) {
					answer++;
					break;
				}
			}
		}
		
		System.out.print(answer);
	}
}
