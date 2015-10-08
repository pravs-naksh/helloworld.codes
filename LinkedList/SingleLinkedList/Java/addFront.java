public void addFront(Object data) {
		Node newNode = new Node(data);
		if(this.head==null){
			this.head = newNode;
			this.tail = newNode;
		} else {
			Node tempHead = this.head;
			newNode.setNext(tempHead);
			this.head = newNode;
		}
}
