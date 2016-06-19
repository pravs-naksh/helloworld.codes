  
    
    class Node 
       int data;
       Node left;
       Node right;
   
    void print_data(Node curr){
        if(curr == null) return;
        if(curr.left!=null)
            System.out.print(curr.left.data + " ");
        if(curr.right!=null)
            System.out.print(curr.right.data + " ");
    }

    void traverseLevel(Node curr){
        if(curr==null) return;
        print_data(curr);
        print_data(curr.left);
        print_data(curr.right);
        if(curr.left != null){
            traverseLevel(curr.left.left);
            traverseLevel(curr.left.right);            
        }
        if(curr.right != null){
            traverseLevel(curr.right.left);
            traverseLevel(curr.right.right);            
        }
        
    }


   void LevelOrder(Node root)
    {
      if(root == null) return;
       System.out.print(root.data+" ");
       traverseLevel(root);
      
    }
