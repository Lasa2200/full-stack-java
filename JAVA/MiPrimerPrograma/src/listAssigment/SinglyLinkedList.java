package listAssigment;

public class SinglyLinkedList {
	public Node head;
	public SinglyLinkedList() {
		this.head =null;
	}
	//Los metodos de la SLL van aqui. Al principio, les mostraremos cómo agregar nodos a la lista.
	public void add(int value) {
		Node newNode = new Node(value);
		if(head == null) {
			head = newNode;
		} else {
			Node runner = head;
			while(runner.next != null) {
				runner = runner.next;
			}
			runner.next = newNode;
		}
	}
	public void remove() {
		Node runner = this.head;
		if(validarVacio()) {
			System.out.println("Nodo vacio");
			return;
		}
		while(runner.next.next != null) {
			runner = runner.next;
		}
		runner.next = null;
	}
	public void printValues() {
		if(validarVacio()) {
			System.out.println("Nodo vacio");
			return;
		}
		Node runner = this.head;
		while(runner.next != null) {
			System.out.println(runner.value);
			System.out.println(runner.next.value);
			runner = runner.next;

		}

	}
	public boolean validarVacio() {
		//	if(this.head == null) {
		//		return true;
		//	
		//	}else {
		//		return false;
		//	}
		return this.head == null;

	}

}