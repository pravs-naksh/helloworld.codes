public Node getAtPosition(int position) {
		if(position == 0) return getFront();
		if(position == this.length()-1) return getBack();
		
		if(this.head == null) return null;
		else{
			Node current = this.head;
			int counter = 0;
			while(current != null){
				if(counter == position) 
					return current;
				current = current.getNext();
			}
			return null;
		}
}
