package java8;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaTest {
	public static void main(String[] args) {
		Stream<String> st = Stream.iterate("", (str) -> str + "x"); 
		System.out.println(st.limit(3).map(str -> str + "y").collect(Collectors.toList()));
	}
}
