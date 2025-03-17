import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String a = br.readLine(), b = br.readLine();
		
		int x1 = a.charAt(0) - 'a', y1 = a.charAt(1) - '1';
        int x2 = b.charAt(0) - 'a', y2 = b.charAt(1) - '1';

        int dx = Math.abs(x2 - x1), dy = Math.abs(y2 - y1);

        if (dx > dy) {
            int temp = dx;
            dx = dy;
            dy = temp;
        }

        System.out.print(dx + " " + dy);
	}
}
