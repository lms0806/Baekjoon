import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
		
		int t = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> row = new ArrayList<>(List.of(0, b));
		ArrayList<Integer> col = new ArrayList<>(List.of(0, a));
		
		while(t --> 0) {
			st = new StringTokenizer(br.readLine());
			int choice = Integer.parseInt(st.nextToken()), num = Integer.parseInt(st.nextToken());
			
			if(choice == 0) {
				row.add(num);
			}
			else {
				col.add(num);
			}
		}
		
		Collections.sort(row);
		Collections.sort(col);
		
		int maxX = 0, maxY = 0;
		for(int i = 0; i < row.size() - 1; i++) {
			maxX = Math.max(maxX, row.get(i + 1) - row.get(i));
		}
		for(int i = 0; i < col.size() - 1; i++) {
			maxY = Math.max(maxY, col.get(i + 1) - col.get(i));
		}
		System.out.print(maxX * maxY);
	}
}

class Node {
	int x, y;
	
	public Node(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
