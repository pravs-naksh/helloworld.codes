public boolean deleteFront() {
		if(this.head == null)
			return false;
		else{
			if(head.getNext()==null){
				head = null;
				return true;
			} else {
				head = head.getNext();
				return true;
			}
		}
}
