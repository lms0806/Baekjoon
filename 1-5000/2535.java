import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		ArrayList<Player> arr = new ArrayList<>();
		
		int t = Integer.parseInt(br.readLine());
		
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			arr.add(new Player(a, b, c));
		}
		
		Collections.sort(arr, new Comparator<Player>() {
			@Override
			public int compare(Player o1, Player o2) {
				return o2.score - o1.score;
			}
			
		});
		
		int[] nation = new int[100];
		
		int count = 0;
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < arr.size(); i++) {
			nation[arr.get(i).nation]++;
			
			if(count == 3) {
				break;
			}
			
			if(nation[arr.get(i).nation] < 3) {
				sb.append(arr.get(i).nation + " " + arr.get(i).number).append("\n");
				count++;
			}
		}
		
		System.out.print(sb);
	}
}
class Player{
	int nation, number, score;

    public Player(int nation, int number, int score) {
    	this.nation = nation;
        this.number = number;
        this.score = score;
    }
}
