package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _1LevelOrderTraversal2D {
    public static List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> result = new ArrayList<>();

        if(root == null) return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> currResult = new ArrayList<>();
            for(int i=0; i<size; i++){

                TreeNode curr = queue.poll();
                currResult.add(curr.val);

                if(curr.left != null){
                    queue.offer(curr.left);
                }

                if(curr.right != null){
                    queue.offer(curr.right);
                }
            }
            result.add(currResult);


        }

        return result;
    }


    public static void main(String[] args) {
//        Integer[] arr = {3,9,20,19,20,15,7, 8,4,5,6,7,8,1,2,3,3,4,5};

        Integer[] arr = {1,2,3,4,null,null,null,5};
        TreeNode root = TreeBuilder.build(arr);

        List<List<Integer>> result = levelOrder(root);

        System.out.println(result);

//        for(Integer node : result){
//            System.out.println(node);
//        }

    }
}

