public Node get(int dataIn) {
		if(this.head == null) return null;
		else{
			Node current = this.head;
			while(current != null){
				if(dataIn == (Integer)current.getData()) 
					return current;
				current = current.getNext();
			}
			return null;
		}
}
