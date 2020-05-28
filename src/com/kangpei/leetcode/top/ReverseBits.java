package com.kangpei.leetcode.top;

/**
 * 颠倒二进制位
 *
 *
 * 颠倒给定的 32 位无符号整数的二进制位。
 *
 *  
 *
 * 示例 1：
 *
 * 输入: 00000010100101000001111010011100
 * 输出: 00111001011110000010100101000000
 * 解释: 输入的二进制串 00000010100101000001111010011100 表示无符号整数 43261596，
 *      因此返回 964176192，其二进制表示形式为 00111001011110000010100101000000。
 *
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-bits
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class ReverseBits {


    /**
     * >>> 表示无符号右移。高位补0.
     *  n & 1 表示取最低位，然后 << 左移bit位，表示取2的bit次方
     * @param n
     * @return
     */
    public int reverseBits(int n) {

        int ans = 0;

        for (int bit = 31; n != 0; n = n >>> 1, bit--) {

            ans += (n & 1) << bit;
        }
        return ans;
    }
}
