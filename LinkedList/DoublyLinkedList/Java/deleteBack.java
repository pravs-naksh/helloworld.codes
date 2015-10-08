public boolean deleteBack() {
		if(this.head == null)
			return false;
		else {
			if(head.getNext()==null && this.tail == null){
				head = null;
				tail = null;
				return true;
			} else {
				Node current = this.head;
				while(current.getNext()!=null){
					if(current.getNext().getNext()==null){
						current.getNext().setPrev(null);
						current.setNext(null);
						this.tail = current;
						return true;
					}
					current = current.getNext();
				}
				return false;
			}
		}
}
