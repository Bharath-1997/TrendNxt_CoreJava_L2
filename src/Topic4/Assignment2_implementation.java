package Topic4;

public class Assignment2_implementation implements Assignment2_wordcount{

	@Override
	public int count(String str) {
		return str.replaceAll("\\s+", " ").split(" ").length;
	}

	
}
