import static java.lang.System.*;

public class AutoBoxingUnboxing {
	public static void main(String[] args) {
		int i = Integer.parseInt("15");
		out.println(i);
		Object obj = false;
		System.out.println(obj.getClass());
		Boolean obj1 = (Boolean)obj;
	}
}