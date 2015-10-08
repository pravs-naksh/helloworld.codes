public void addAtPosition(Object data, int position) {
		if (position == 0){
			addFront(data);
			return;
		}
		if (position >= this.length()){
			addBack(data);
			return;
		}

		Node newNode = new Node(data);
		if (this.head == null && this.tail == null) {
			this.head = newNode;
			this.tail = newNode;
		} else {
			Node current = this.head;
			Node previous = this.head;
			int counter = 0;
			while (current != null) {
				if (counter == position) {
					previous.setNext(newNode);
					newNode.setNext(current);
					break;
				}
				previous = current;
				current = current.getNext();
				counter++;
			}

		}
}
