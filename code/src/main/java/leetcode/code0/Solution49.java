package leetcode.code0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @date 2022/11/24 16:19
 * @author huangchenguang
 * @desc 字母异位词分组
 */
public class Solution49 {

    public static void main(String[] args) {
        Solution49 solution49 = new Solution49();
        System.out.println(solution49.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
    }

    /**
     * @date 2022/11/24 16:20
     * @author huangchenguang
     * @desc
     */
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mapResult = new HashMap<>();
        for (String s : strs) {
            int[] temp = new int[26];
            for (int i = 0; i < s.length(); i++) {
                temp[s.charAt(i) - 'a']++;
            }
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                if (temp[i] > 0) {
                    builder.append((char) (i + 'a'));
                    builder.append(temp[i]);
                }
            }
            String key = builder.toString();
            List<String> list = mapResult.getOrDefault(key, new ArrayList<>());
            list.add(s);
            mapResult.put(key, list);
        }
        return new ArrayList<>(mapResult.values());
    }

}
