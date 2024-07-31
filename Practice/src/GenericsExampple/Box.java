package GenericsExampple;

public class Box<T> {

	T container;

	public T getValue() {
		return container;
	}

	public void setContainer(T container) {
		this.container = container;
	}

	public Box(T container) {
		super();
		this.container = container;
	}

	
}
