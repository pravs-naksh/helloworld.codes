public boolean deleteBack() {
		if(this.head == null)
			return false;
		else{
			if(head.getNext()==null){
				head = null;
				return true;
			} else {
				Node current = this.head;
				while(current.getNext()!=null){
					if(current.getNext().getNext()==null){
						current.setNext(null);
						return true;
					}
					current = current.getNext();
				}
				return false;
			}
		}
}
