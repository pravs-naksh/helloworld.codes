public Node get(String dataIn) {
		
		if(this.head == null) return null;
		else{
			Node current = this.head;
			while(current != null){
				if(dataIn == (String)current.getData()) 
					return current;
				current = current.getNext();
			}
			return null;
		}
}
