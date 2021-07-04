import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	static int size, count;
	static boolean[][] check;
	static boolean[][] arr;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		size = Integer.parseInt(br.readLine());
		
		arr = new boolean[size][size];
		check = new boolean[size][size];
		for(int i = 0; i < size; i++) {
			String str = br.readLine();
			for(int j = 0; j < str.length(); j++) {
				if(str.charAt(j) == '1') {
					arr[i][j] = true;
				}
			}
		}
		
		ArrayList<Integer> arr = new ArrayList<>();
		int answer = 0;
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				count = 0;
				if(checktrue(i,j)) {
					answer++;
					bfs(i,j);
					arr.add(count);
				}
			}
		}
		
		Collections.sort(arr);
		
		StringBuilder sb = new StringBuilder();
		sb.append(answer).append("\n");
		for(int i = 0; i < arr.size(); i++) {
			sb.append(arr.get(i)).append("\n");
		}
		System.out.print(sb);
	}
	
	public static boolean checktrue(int row, int col) {
		if(row < 0 || row >= size || col < 0 || col >= size || check[row][col] || !arr[row][col]) {
			return false;
		}
		return true;
	}
	
	public static void bfs(int row, int col) {
		check[row][col] = true;
		
		count++;
		if(checktrue(row - 1, col)) {
			bfs(row - 1, col);
		}
		if(checktrue(row, col - 1)) {
			bfs(row, col - 1);
		}
		if(checktrue(row, col + 1)) {
			bfs(row, col + 1);
		}
		if(checktrue(row + 1, col)) {
			bfs(row + 1, col);
		}
	}
}
