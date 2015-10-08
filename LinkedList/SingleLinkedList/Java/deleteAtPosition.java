public boolean deleteAtPosition(int position) {
		if (position == 0){
			return deleteFront();
		}
		if (position == this.length()-1){
			return deleteBack();
		}
		
		if (position == 0){
			return deleteFront();
		}
		if (position == this.length()-1){
			return deleteBack();
		}
		
		if(this.head == null && this.tail == null)
			return false;
		else{
			if(head.getNext()==null){
				head = null;
				tail = null;
				return true;
			} else {
				Node current = this.head;
				Node previous = this.head;
				int counter = 0;
				while(current.getNext()!=null){
					if(counter==position){
						previous.setNext(current.getNext());
						return true;
					}
					previous = current;
					current = current.getNext();
					counter++;
				}
				return false;
			}
		}
}
