public boolean deleteFront() {
		if(this.head == null && this.tail == null)
			return false;
		else{
			if(head.getNext()==null){
				head = null;
				tail = null;
				return true;
			} else {
				head = head.getNext();
				return true;
			}
		}
}
