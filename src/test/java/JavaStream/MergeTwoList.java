package JavaStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MergeTwoList {

	@Test
	public void listMerge() {

		ArrayList<String> name1 = new ArrayList<String>();
		name1.add("Ram");
		name1.add("Adam");
		name1.add("Vinoth");
		name1.add("Abhijeet");
		name1.add("Jay");

		List<String> name2 = Arrays.asList("Dinga", "Jhon", "Demon", "Jim", "Doma");
		// merging two different List
		Stream<String> newStrim = Stream.concat(name1.stream(), name2.stream());
		// newStrim.sorted().forEach(a -> System.out.println(a));

		boolean flag = newStrim.anyMatch(s -> s.equalsIgnoreCase("Adam"));
		System.out.println(flag);
		Assert.assertTrue(flag);

		System.out.println("-------------------------------");

		// Stream Collect

		List<String> ls = Stream.of("Rama", "Shyam", "Aswini", "Abhishek", "Adam").filter(s -> s.startsWith("A"))
				.map(s -> s.toUpperCase()).collect(Collectors.toList());

		System.out.println(ls.get(0));

		System.out.println("----------------------------");

		// print unique number from given array

		List<Integer> values = Arrays.asList(1, 3, 2, 4, 4, 5, 5, 9, 7, 3, 7);
		values.stream().distinct().forEach(s -> System.out.println(s));
		System.out.println("-----------------------------------------------");
		List<Integer> listValues = values.stream().distinct().sorted().collect(Collectors.toList());
		
		System.out.println(listValues.get(2));

	}

}
