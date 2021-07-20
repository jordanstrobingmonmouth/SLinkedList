
public class Test {

	public static void main(String[] args) {
		List n = new List();
		
		n.addLast("Tom");
		
		n.addFirst("Joe");
		n.addFirst("Jake");
		n.addFirst("Jim");
		n.addFirst("Mike");
		n.addFirst("Steven");
		
		n.addLast("Kevin");
		n.addFirst("Brian");
		
		n.addAfterHead("Andrew");
		
		n.addLast("Jackson");
		
		n.addLastWithTail("Max");
		
		n.display();

	}

}
