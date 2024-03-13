public class XPoly {
	public static final double sum(double...x) {
		double sum = 0;
		for(double giaTri: x) {
			sum += giaTri;
		}
		return sum;
	}
	public static final double min(double...x) {
		double min = x[0];
		for (double d : x) {
			if(min > d) {
				min  = d;
			}
		}
		return min;
	}
	public static final double max(double...x) {
		double max = x[0];
		for (double d : x) {
			if(max < d) {
				max  = d;
			}
		}
		return max;
	}
	public static final String toUpperFirstChar(String s) {
		String[] words = s.split(" ");
		for (int i = 0; i < words.length; i++) {
		    char firstChar = words[i].charAt(0);
		    String upperFirstChar = String.valueOf(firstChar).toUpperCase();
		    words[i] = upperFirstChar + words[i].substring(1);
		}

		String ss = String.join(" ", words);
		return ss;
	}
}
