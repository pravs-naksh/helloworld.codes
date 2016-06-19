 
 class Node { 
    int data;
    Node left;
    Node right;
}

static Node Insert(Node root,int value)
    {
        if(root == null){
            //create node 
            root = create_node(value);
        } else 
            root = insert_helper(root,value);
        return root;
    }

 static Node insert_helper(Node root,int value){
        
        if(root.data > value){
            if(root.left == null){
                root.left = create_node(value);
            } else
                insert_helper(root.left,value);
        } else{
            if(root.right == null){
                root.right = create_node(value);
            } else
                insert_helper(root.right,value);
        }
        return root;
    }

  static  Node create_node(int value){
        Node new_node = new Node();
        new_node.data = value;
        new_node.left = null;
        new_node.right = null;        
        return new_node;
    }




