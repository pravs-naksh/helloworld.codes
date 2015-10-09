public void push(Object data){
  //Invoking addFront from Single/Doubly Linked List Implementation
  if (this.size == this.capacity) {
		System.out.println("Stack full!");
		return;
	}
	
	this.linkedlist.addFront(data);
	this.top = this.linkedlist.getFront();
	this.setSize(getSize() + 1);
}
