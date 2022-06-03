import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetEjemplo {

	public static void main(String[] args) {

		Set<String> set = new HashSet<String>();
		set.add("one");
		set.add("second");
		set.add("3rd");
		set.add("3");
		set.add("5.0F");
		set.add("second"); // dplicated, not added
		set.add("4"); // duplicated, not added
		System.out.println(set);

		Set<String> set2 = new TreeSet<String>();
		set2.add("one");
		set2.add("second");
		set2.add("3rd");
		set2.add("3");
		set2.add("5.0F");
		set2.add("second"); // dplicated, not added
		set2.add("4"); // duplicated, not added
		System.out.println(set2);
		set2.remove("4");
		System.out.println(set2);
		System.out.println(set2.contains("3"));

	}

}
