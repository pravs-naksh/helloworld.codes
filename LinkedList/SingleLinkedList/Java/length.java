public int length() {
		int counter = 0;
		Node current = this.head;
		while (current != null) {
			counter++;
			current = current.getNext();
		}
		return counter;
}
