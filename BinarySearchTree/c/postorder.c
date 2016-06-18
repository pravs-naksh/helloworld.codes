struct Node{
  int data;
  struct Node * left;
  struct Node * right;
};


void postOrder(Node * root){
  if(root == NULL) return;
  postOrder(root->left);
  postOrder(root->right);
  printf(" %d ",root->data);
}
