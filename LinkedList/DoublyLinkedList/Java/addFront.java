public void addFront(Object data) {
		Node newNode = new Node(data);
		if (this.head == null) {
			this.head = newNode;
		} else {
			Node tempHead = this.head;
			newNode.setNext(tempHead);
			tempHead.setPrev(newNode);
			this.head = newNode;
		}
}
