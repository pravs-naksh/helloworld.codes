public void addBack(Object data) {
		Node newNode = new Node(data);
		if(this.head==null){
			this.head = newNode;
		} else {
			Node current = this.head;
			while(current!=null){
				if(current.getNext()==null){
					current.setNext(newNode);
					break;
				}
				current = current.getNext();
			}
		}
}
