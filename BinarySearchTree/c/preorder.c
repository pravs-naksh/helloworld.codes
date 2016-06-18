
struct node
{
    int data;
    struct node* left;
    struct node* right;
};



void preOrder(node *root) {
    if(root==NULL) return;
    printf("%d ",root->data);
    preOrder(root->left);
    preOrder(root->right);
}
