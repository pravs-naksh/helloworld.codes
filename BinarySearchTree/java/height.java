

int height(Node root){
  if(root == null) return -1;
  
  return 1 + max(height(root.left),height(root.right));
}

int max(int a, int b){
  if(a>b) return a;
  return b;
}
