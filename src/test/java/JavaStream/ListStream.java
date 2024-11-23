package JavaStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class ListStream {

//	@Test
	public void regular() {

		ArrayList<String> name = new ArrayList<String>();
		name.add("Dinga");
		name.add("Adam");
		name.add("Vinoth");
		name.add("Abhijeet");
		name.add("Shyam");
		name.add("ABhishek");
		int count = 0;

		for (int i = 0; i < name.size(); i++) {

			String actualName = name.get(i);
			if (actualName.startsWith("A")) {

				count++;
			}
		}

		System.out.println(count);

	}

	@Test
	public void streamFilter() {

		ArrayList<String> name = new ArrayList<String>();
		name.add("Ram");
		name.add("Adam");
		name.add("Vinoth");
		name.add("Abhijeet");
		name.add("Jay");
		name.add("ABhishek");
		int count = 0;

		Long c = name.stream().filter(s -> s.startsWith("A")).count();
		System.out.println(c);

//		Long D = Stream.of("Demon", "Abhijeet", "Ding", "Ram", "Jay").filter(s->
//
//		{
//			s.startsWith("D");
//			return true;
//		}).count();
//
//		System.out.println("d : " + D);

		Long D1 = Stream.of("Demon", "Abhijeet", "Dinga", "Ram", "Jay").filter(s -> s.startsWith("D")).count();

		System.out.println("d1 : " + D1);

		name.stream().filter(s -> s.length() > 4).forEach(s -> System.out.println(s));
		name.stream().filter(s -> s.length() > 4).limit(2).forEach(s -> System.out.println(s));

		System.out.println("----------------------------------------------");
		// "print names which having last letter as "a" with UpperCase");

		Stream.of("Demon", "Abhijeet", "Dinga", "Rama", "Jay").filter(s -> s.endsWith("a")).map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));
		
		System.out.println("----------------------------------------------");
		// "print names which having first letter as "a" with upperCase and sorted

		List<String> names = Arrays.asList("Abhijeet", "Demon", "Dinga", "Adam", "Rama", "Dam");
		names.stream().filter(s -> s.startsWith("D")).sorted().map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));
		;
		// sorted, upperCase,startsWith, forEach  etc these are terminal operators

	}

}
