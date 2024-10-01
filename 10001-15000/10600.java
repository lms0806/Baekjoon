import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[][] arr = {{255, 255, 255}, {192, 192, 192}, {128, 128, 128}, {0, 0, 0}, {255, 0, 0}, {128, 0, 0}, {255, 255, 0}, {128, 128, 0}, {0, 255, 0}, {0, 128, 0}, {0, 255, 255}, {0, 128, 128}, {0, 0, 255}, {0, 0, 128}, {255, 0, 255}, {128, 0, 128}};
		String[] str = {"White", "Silver", "Gray", "Black", "Red", "Maroon", "Yellow", "Olive", "Lime", "Green", "Aqua", "Teal", "Blue", "Navy", "Fuchsia", "Purple"};
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int r = Integer.parseInt(st.nextToken()), g = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			
			if(r == -1 && g == -1 && b == -1) {
				break;
			}
			
			int idx = 0, min = Integer.MAX_VALUE;
			for(int i = 0; i < str.length; i++) {
				int d = (int) Math.sqrt(Math.pow((arr[i][0] - r), 2) + Math.pow((arr[i][1] - g), 2) + Math.pow((arr[i][2] - b), 2));
				
				if(d < min) {
					min = d;
					idx = i;
				}
			}
			sb.append(str[idx]).append("\n");
		}
		System.out.print(sb);
	}
}
