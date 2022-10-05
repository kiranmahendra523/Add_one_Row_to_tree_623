class Solution {
    public void solve(TreeNode root,int val,int dept,int cur){
        if(root == null){
            return;
        }
        if(cur == dept-1){
            TreeNode temp = root.left;
            root.left = new TreeNode(val);
            root.left.left = temp;
            temp = root.right;
            root.right = new TreeNode(val);
            root.right.right = temp;
        
        }
        else{
            solve(root.left,val,dept,cur+1);
            solve(root.right,val,dept,cur+1);
        }
        return;
    }
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(root==null){
            return null;
        }
        if(depth==1){
            TreeNode temp = new TreeNode(val,root,null);
            return temp;
        }
        solve(root,val,depth,1);
        return root;
    }
}
