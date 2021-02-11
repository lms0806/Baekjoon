public class Main {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("NFC West       W   L  T").append("\n");
		sb.append("-----------------------").append("\n");
		sb.append("Seattle        13  3  0").append("\n");
		sb.append("San Francisco  12  4  0").append("\n");
		sb.append("Arizona        10  6  0").append("\n");
		sb.append("St. Louis      7   9  0\n").append("\n");

		sb.append("NFC North      W   L  T").append("\n");
		sb.append("-----------------------").append("\n");
		sb.append("Green Bay      8   7  1").append("\n");
		sb.append("Chicago        8   8  0").append("\n");
		sb.append("Detroit        7   9  0").append("\n");
		sb.append("Minnesota      5  10  1");
		System.out.print(sb);
	}
}
