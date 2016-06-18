class Node {
    int data;
    Node left;
    Node right;
}

void postOrder(Node root) {
    if(root == null) return;
  
    preOrder(root.left);
    preOrder(root.right);
    System.out.print(root.data+" ");
}
