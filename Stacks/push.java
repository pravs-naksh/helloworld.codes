public void push(Object data){
  //Invoking addFront from Single/Doubly Linked List Implementation
  this.internalSingleLL.addFront(data);
  this.top = this.internalSingleLL.getFront();
}
