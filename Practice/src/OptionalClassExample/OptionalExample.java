package OptionalClassExample;

import java.util.Optional;

public class OptionalExample {

	public static Optional<String> getName(){
		String name = null;
		return Optional.ofNullable(name);
	}
	public static void main(String[] args) {
		
		String str = null;
		
//		Optional<String> optional = Optional.empty();
		Optional<String> optional = Optional.ofNullable(str);
		
		System.out.println(optional.isPresent());
//		System.out.println(optional.get());
		System.out.println(optional.orElse("No value in this object"));

	     Optional<String> nameOptional= getName();
	     System.out.println(nameOptional.orElse("null return"));
	}
}


