
struct node{
  int data;
  struct node* left;
  struct node* right;
};

void inorder(node* root){
  if(root == NULL) return;
  
  inorder(root->left);
  printf(" %d ",root->data);
  inorder(root->right);
}
