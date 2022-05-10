package programming;

import java.util.List;
import java.util.function.Supplier;

public class FP03MethodReferences {
	
	private static void print(String str) {
		System.out.println(str);
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		FP03MethodReferences obj=new FP03MethodReferences();
		List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", 
					"AWS", "PCF", "Azure", "Docker",
					"Kubernetes");
		
		courses.stream()
		 //.map(str -> str.toUpperCase())
		 .map(String::toUpperCase)
		 .forEach(FP03MethodReferences::print);
		//.forEach(obj::print);
		
		Supplier<String> supplier = String::new;
		

	}
}
