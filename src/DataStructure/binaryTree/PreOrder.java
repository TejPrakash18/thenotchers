package DataStructure.binaryTree;


import com.sun.source.tree.Tree;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val){
        this.val = val;
        right = left = null;
    }

    static int idx= -1;
    public static TreeNode buildTree(int[] arr){
        idx++;
        if(arr[idx] == -1) return null;
        TreeNode root = new TreeNode(arr[idx]);
        root.left = buildTree(arr);
        root.right = buildTree(arr);
        return root;
    }
   public static void traversal(TreeNode root){
        if(root == null) return;
       System.out.println(root.val);
       traversal(root.left);
       traversal(root.right);
    }

    public static int sumOftree(TreeNode root){
        if(root == null) return 0;

        int leftSum = sumOftree(root.left);
        int rightSum = sumOftree(root.right);
        return leftSum+rightSum + root.val;
    }
}


public class PreOrder {
    public static void main(String[] args) {
        int[] arr = {1,2,-1,-1,3,4,-1,-1,5,-1,-1};
        TreeNode root = TreeNode.buildTree(arr);
        TreeNode.traversal(root);

        System.out.println( TreeNode.sumOftree(root));

//        System.out.println(root.val);
//        System.out.println(root.left.val);
//        System.out.println(root.right.val);
    }
}
