package leetcode.editor.cn;

//给定一个整数，编写一个函数来判断它是否是 2 的幂次方。 
//
// 示例 1: 
//
// 输入: 1
//输出: true
//解释: 20 = 1 
//
// 示例 2: 
//
// 输入: 16
//输出: true
//解释: 24 = 16 
//
// 示例 3: 
//
// 输入: 218
//输出: false 
// Related Topics 位运算 数学 
// 👍 266 👎 0


public class Q231_PowerOfTwo {
    public static void main(String[] args) {
        Solution solution = new Solution();
    }

    public static
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isPowerOfTwo(int n) {
            if (n <= 0) {
                return false;
            }
            return (n & (n - 1)) == 0;
        }

        public boolean isPowerOfTwo1(int n) {
            if (n < 0) {
                return false;
            }

            if (n == 1) {
                return true;
            }

            String s = Integer.toBinaryString(n);

            String replace = s.replace("0", "");
            return replace.equals("1");


        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}