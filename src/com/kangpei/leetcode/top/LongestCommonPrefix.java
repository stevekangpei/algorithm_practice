package com.kangpei.leetcode.top;

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。

 如果不存在公共前缀，返回空字符串 ""。

 示例 1:

 输入: ["flower","flow","flight"]
 输出: "fl"
 示例 2:

 输入: ["dog","racecar","car"]
 输出: ""
 解释: 输入不存在公共前缀。


 来源：力扣（LeetCode）
 链接：https://leetcode-cn.com/problems/longest-common-prefix
 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * Created by kangpei on 2020/5/11.
 */
public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {

        if ( null == strs || strs.length == 0) {
            return "";
        }
        String ans = strs[0];

        for (int i = 1; i < strs.length; i++) {

            int j = 0;
            String str = strs[i];
            for (; j < ans.length() && j < str.length(); j++) {

                if (ans.charAt(j) != str.charAt(j)) {

                    break;
                }
            }
            ans = ans.substring(0, j);
        }

        return ans;
    }
}
