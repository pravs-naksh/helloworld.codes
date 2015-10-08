public void addBack(Object data) {
		Node newNode = new Node(data);
		if (this.head == null && this.tail == null) {
			this.head = newNode;
			this.tail = newNode;
		} else {
			Node tempTail = this.tail;
			tempTail.setNext(newNode);
			this.tail = newNode;
		}
}
