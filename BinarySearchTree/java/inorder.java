class Node {
    int data;
    Node left;
    Node right;
}

void inOrder(Node root) {
    if(root == null) return;
  
    preOrder(root.left);
    System.out.print(root.data+" ");
    preOrder(root.right);
}
