package Composition;

public class BookApp {

	public static void main(String[] args) {

		Book bk = new Book("KodNest");
		bk.readBook();
		bk.p.writeContent();
		bk= null;
		bk.p.writeContent(); // NullPointerException
	}

}

//Compositon : Composition is such has a relation ship which represents strong association in b/w the objects
//In simple words if enclosing object is created or destroy the automatically composit object is also created or destroy.
//Ex: Student - enclosing object, Brain - composit object
//EX: Mobile - enclosing object, OS - composit object