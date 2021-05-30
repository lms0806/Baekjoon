import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= size; i++) {
			int num = Integer.parseInt(br.readLine());
			ArrayList<Integer> arr = new ArrayList<>();
			
			sb.append("Case ").append(i).append(":").append("\n");
			for(int j = 1; j <= 6; j++) {
				if(j + 6 >= num && j + 1 <= num) {
					arr.add(j);
					arr.add(num-j);
				}
			}
			
			for(int j = 0; j < arr.size() / 2; j += 2) {
				sb.append("(").append(arr.get(j)).append(",").append(arr.get(j+1)).append(")\n");
			}
		}
		System.out.print(sb);
	}
}
