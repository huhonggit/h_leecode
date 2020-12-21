package leetcode.editor.cn;

//编写一个函数来查找字符串数组中的最长公共前缀。 
//
// 如果不存在公共前缀，返回空字符串 ""。 
//
// 示例 1: 
//
// 输入: ["flower","flow","flight"]
//输出: "fl"
// 
//
// 示例 2: 
//
// 输入: ["dog","racecar","car"]
//输出: ""
//解释: 输入不存在公共前缀。
// 
//
// 说明: 
//
// 所有输入只包含小写字母 a-z 。 
// Related Topics 字符串 
// 👍 1388 👎 0


public class Q14_LongestCommonPrefix {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] test  ={"a"};
        String s = solution.longestCommonPrefix(test);
        System.out.println(s);
    }
public static
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length==0){
            return "";
        }

        String str1 = strs[0];
        int length = str1.length();
        for (int i = 1; i < strs.length; i++) {
            length = Math.min(length, strs[i].length());
        }
        if (length == 0){
            return "";
        }

        for (int i = 0; i < length; i++) {
            char c1 = str1.charAt(i);
            for (int j = 1; j < strs.length; j++) {
                char c = strs[j].charAt(i);
                if (c != c1) {
                    return i > 0 ? str1.substring(0, i) : "";
                }
            }
        }

        return str1.substring(0, length);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}