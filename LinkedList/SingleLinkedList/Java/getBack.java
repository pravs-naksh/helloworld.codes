public Node getBack(){
		if(this.head == null) return null;
		else{
			Node current = this.head;
			while(current != null){
				if(current.getNext()==null) 
					return current;
				current = current.getNext();
			}
			return null;
		}
}
