package com.kangpei.leetcode.top;

import javafx.util.Pair;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 给定一个二叉树，找出其最大深度。

 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。

 说明: 叶子节点是指没有子节点的节点。

 示例：
 给定二叉树 [3,9,20,null,null,15,7]，

 3
 / \
 9  20
 /  \
 15   7
 返回它的最大深度 3 。



 来源：力扣（LeetCode）
 链接：https://leetcode-cn.com/problems/maximum-depth-of-binary-tree
 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * Created by kangpei on 2020/5/17.
 */
public class MaxDepth {

    public int maxDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int left = maxDepth(root.left);
        int right= maxDepth(root.right);
        return Math.max(left, right) + 1;
    }

    /**
     * 采用深度优先搜索的方式来进行查询
     * @param root
     * @return
     */
    public int maxDepth1(TreeNode root) {

        Queue<Pair<TreeNode, Integer>> pairs = new LinkedList<>();
        pairs.add(new Pair<>(root, 1));

        int max = 0;

        while (pairs.size() > 0) {

            Pair<TreeNode, Integer> pair = pairs.poll();
            TreeNode key = pair.getKey();

            if (key != null) {
                max = Math.max(pair.getValue(), max);
                pairs.add(new Pair<>(key.left, pair.getValue() + 1));
                pairs.add(new Pair<>(key.right, pair.getValue() + 1));
            }
        }
        return max;
    }
}
