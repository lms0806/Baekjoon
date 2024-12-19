import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        Node[] point = new Node[n];
        
        for(int i = 0; i < n; i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	point[i] = new Node(Double.parseDouble(st.nextToken()), Double.parseDouble(st.nextToken()));
        }
        
        double answer = 0;
        for(int i = 1; i < n - 1; i++) {
        	answer += ((point[i].x - point[0].x) * (point[i + 1].y - point[0].y) - (point[i + 1].x - point[0].x) * (point[i].y - point[0].y)) / 2.0;
        }
        System.out.print(String.format("%.1f", answer < 0 ? -answer : answer));
    }
}

class Node {
	double x, y;
	
	public Node(double x, double y) {
		this.x = x;
		this.y = y;
	}
}
