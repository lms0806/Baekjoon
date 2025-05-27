import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int level = Integer.parseInt(br.readLine());
		
		int[][] arcane = {{220, 210, 200}, {225, 220, 210}, {230, 225, 220}, {235, 230, 225}, {245, 235, 230}, {250, 245, 235}};
		int[][] grandis = {{270, 265, 260}, {275, 270, 265}, {280, 275, 270}, {285, 280, 275}, {290, 285, 280}, {295, 290, 285}, {300, 295, 290}};
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < arcane.length; i++) {
			sb.append(level >= arcane[i][0] ? 100 : level >= arcane[i][1] ? 300 : level >= arcane[i][2] ? 500 : 0);
			
			if(i < arcane.length - 1) {
				sb.append(" ");
			}
		}
		sb.append("\n");
		for(int i = 0; i < grandis.length; i++) {
			sb.append(level >= grandis[i][0] ? 100 : level >= grandis[i][1] ? 300 : level >= grandis[i][2] ? 500 : 0);
			
			if(i < grandis.length - 1) {
				sb.append(" ");
			}
		}
		System.out.print(sb);
	}
}
