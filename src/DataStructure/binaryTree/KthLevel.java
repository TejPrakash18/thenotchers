package DataStructure.binaryTree;

class KNode {
    int val;
    KNode left;
    KNode right;

    KNode(int val) {
        this.val = val;
        right = left = null;
    }
    static int idx= -1;
    public static KNode buildTree(int[] arr){
        idx++;
        if(arr[idx] == -1) return null;
        KNode root = new KNode(arr[idx]);
        root.left = buildTree(arr);
        root.right = buildTree(arr);
        return root;
    }
    public static void kthLevel(KNode root, int k){
        if(root == null) return;
        if(k==1){
            System.out.println(root.val);
            return;
        }
        kthLevel(root.left, k-1);
        kthLevel(root.right, k-1);
    }
}
public class KthLevel {
    public static void main(String[] args) {
        int[] arr = {1,2,7,-1,-1,-1,3,4,-1,-1,5,-1,-1};

        KNode root = KNode.buildTree(arr);
        KNode.kthLevel(root, 3);



    }
}
