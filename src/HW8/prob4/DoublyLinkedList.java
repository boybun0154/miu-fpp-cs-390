package HW8.prob4;

public class DoublyLinkedList {
	
		Node header;
		DoublyLinkedList(){
			header = new Node();
		}
		//1. adds to the end of the list
		public void addLast(String item){
			//implement
			if (header.next == null){
				header.next = new Node(header,item,null);
			} else {
				Node current = header.next;
				while (current.next != null){
					current = current.next;
				}
				current.next = new Node(current,item,null);
			}
		}
		// 2. Remove by passing object
		public boolean remove(String item){
			//Implement
			if (header.next == null) return false;
			else {
				for (Node current = header.next; current!=null; current = current.next) {
					if (current.value.equals(item)){
						current.next.previous = current.previous;
						current.previous.next = current.next;
						current = null;
						return true;
					}
				}
			}
			return false;
		}

		// 3. Remove the First Node

		public boolean removeFirst() {
		  // Implement
			if (header.next == null) return false;
			else {
				Node current = header.next;
				header.next = current.next;
				current.next.previous = header;
				current=null;
				return true;
			}
		}


		// 4. Prints the list from last to first
		 public void printReverse() {

		     // Implement
		}
		@Override
		public String toString() {
			
			StringBuilder sb = new StringBuilder();
			toString(sb, header);
			return sb.toString();
			
		}
		private void toString(StringBuilder sb, Node n) {
			if(n==null) return;
			if(n.value != null) sb.append(" " + n.value);
			toString(sb, n.next);
		}
		
		class Node {
			String value;
			Node next;
			Node previous;

			public Node() {
			}

			Node(String value) {
				this.value = value;
			}

			Node(Node previous, String value, Node next) {
				this.value = value;
				this.next = next;
				this.previous = previous;
			}
			
			public String toString() {
				return value == null ? "null" : value;
			}
		}
	
		public static void main(String[] args){
			DoublyLinkedList list = new DoublyLinkedList();
			list.addLast("Bob");
			list.addLast("Harry");
			list.addLast("Steve");
			System.out.println(list);

			list.remove("Harry");
			System.out.println(list);

			list.removeFirst();
			System.out.println(list);

			// Call all your implemented Methods 
		}
}
