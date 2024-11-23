package JavaPrctises;

public class StringIndepth {

	public static void main(String[] args) {

		String a = "Hello"; // String literal mutable
		String b = "Hello";
// let's say I have created another string b Variable and content of this string variable is also Hello.
// If this is the case in memory, another object will not be created.
// So whenever you create a new object of string first it will see in the memory if there is any object ready with same content 
// If it is there then this be reference variable will point to this original object.
// But you will not have one more copy in the memory.

		a.concat("world");
		System.out.println(a); // it will print 'Hello' so concatenate not happen here
		// so original will not be updated
		// so this will be happen due to immutable
		String c = a.concat("world"); // this is possible due to new object is created here

		// to avoid this Java classes has- String buffer & builder which is mutable in
		// nature
		String s = new String("hello"); // String class create new object every time in memory
		String s1 = new String("hello");
		// in above case it will create memory for each case and not look the object
		// content data

		// String buffer & builder
		StringBuffer sb = new StringBuffer("Hello");
		sb.append("world");
		System.out.println(sb); // Helloworld
		sb.insert(2, "she");// Heshelloworld
		System.out.println(sb);
		sb.replace(5, 7, "aa"); // 5th & 6th char will be replace--> Hesheaaoworld
		System.out.println(sb);
		sb.deleteCharAt(12);
		System.out.println(sb); // Hesheaaoworl
		sb.reverse();
		System.out.println(sb);
		
		// String Builder is not thread Safe & non Synchronize
		// Thread safe- -> if multiple program tried to access sb variable so Builder will not allow to access then at a time
		// after execution of one thread then it will allow another thread to access sb variable
		// Builder is faster than string String Buffer
		// *** if Framework support parallel stuff then That time we have make use of String Buffer bcz it is a thread safe and Synchronize
	 
		System.out.println(a.equals(b)); // true check for content
		System.out.println(a==b); // true matching the references
		System.out.println(a.equalsIgnoreCase(s)); //true check for content
		System.out.println(a==s);// false matching the references
		System.out.println(s==s1);// false matching the references
		System.out.println(s.equals(s1)); // true check for content
	
	
	
	}
}
