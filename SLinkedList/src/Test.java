
public class Test {

	public static void main(String[] args) {
		List n = new List();
		
		n.addLastWithTail("Jeffrey");
		n.addFirst("Joe");
		n.addFirst("Jake");
		n.addFirst("Jim");
		n.addFirst("Mike");
		n.addFirst("Steven");
		
		n.addFirst("Brian");
		
		n.addAfterHead("Andrew");
		
		
		n.addLastWithTail("Max");
		
		n.deleteTail();
		
		n.display();
		
		n.swap();
		System.out.println();
		
		n.display();
		

	}

}
