package Topic4;

public class Assignment1_interface_implementation implements Assignment1_interface{

	@Override
	public int findOccurence(String str, char c) {
		return (int) str.codePoints().filter(ch -> ch == c).count();
	}

}
