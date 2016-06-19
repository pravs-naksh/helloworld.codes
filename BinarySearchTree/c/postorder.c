struct node{
  int data;
  struct node* left;
  struct node* right;
};


void postOrder(node* root){
  if(root == NULL) return;
  postOrder(root->left);
  postOrder(root->right);
  printf(" %d ",root->data);
}
