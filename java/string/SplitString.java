public class SplitString {
	public static String[] split(String input, String delim) {
		if (input.isEmpty() || delim.isEmpty())
			return null;
		
		return input.split(delim);
	}
	
	public static void main(String[] args) {
		System.out.println("split of toto;tot;oto;to");
		String[] splited = SplitString.split("toto;tot;oto;to", ";");
		
		for(String s: splited) {
			System.out.println("splited: " + s);
		}
	}
	
}