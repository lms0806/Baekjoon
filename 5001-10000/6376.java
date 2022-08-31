public class Main {
	public static void main(String[] args) {
		double answer = 1;
		
		StringBuilder sb = new StringBuilder();
		sb.append("n e").append("\n").append("- -----------").append("\n").append("0 1").append("\n");
		for(int i = 1; i <= 9; i++) {
			sb.append(i).append(" ");
			
			answer += 1 / fact(i);
			
			sb.append(i == 1 ? 2 : i == 2 ? 2.5 : String.format("%.9f", answer)).append("\n");
		}
		System.out.print(sb);
	}
	
	public static double fact(int n) {
		double f = 1;
		for(double i = 2; i <= n; i++) {
			f *= i;
		}
		return f;
	}
}
