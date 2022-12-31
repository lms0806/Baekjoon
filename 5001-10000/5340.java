import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		ArrayList<Integer> arr = new ArrayList<>();
		
		for(int i = 0; i < 6; i++) {
			arr.add(br.readLine().trim().length());
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append("Latitude ").append(arr.get(0)).append(":").append(arr.get(1)).append(":").append(arr.get(2)).append("\n");
		sb.append("Longitude ").append(arr.get(3)).append(":").append(arr.get(4)).append(":").append(arr.get(5));
		System.out.print(sb);
	}
}
