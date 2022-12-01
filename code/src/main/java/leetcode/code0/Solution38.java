package leetcode.code0;

/**
 * @date 2022/12/1 09:59
 * @author huangchenguang
 * @desc 外观数列
 */
public class Solution38 {

    public static void main(String[] args) {
        Solution38 solution38 = new Solution38();
        System.out.println(solution38.countAndSay(4));
    }

    /**
     * @date 2022/12/1 10:26
     * @author huangchenguang
     * @desc 模拟法
     */
    public String countAndSay(int n) {
        StringBuilder builder = new StringBuilder("1");
        for (int i = 2; i <= n; i++) {
            char temp = builder.charAt(0);
            int tempCount = 0;
            StringBuilder tempResult = new StringBuilder();
            for (int j = 0; j < builder.length(); j++) {
                if (builder.charAt(j) == temp) {
                    tempCount++;
                } else {
                    tempResult.append(tempCount);
                    tempResult.append(temp);
                    temp = builder.charAt(j);
                    tempCount = 1;
                }
            }
            if (tempCount != 0) {
                tempResult.append(tempCount);
                tempResult.append(temp);
            }
            builder = tempResult;
        }
        return builder.toString();
    }

}
