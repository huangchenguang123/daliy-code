package leetcode.code800;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @date 2022/10/10 14:10
 * @author huangchenguang
 * @desc 钥匙和房间
 */
public class Solution841 {

    /**
     * @date 2022/10/10 15:07
     * @author huangchenguang
     * @desc bfs遍历，判断能否打开房间
     */
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(0);
        boolean[] marks = new boolean[rooms.size()];
        while (!queue.isEmpty()) {
            int key = queue.poll();
            marks[key] = true;
            List<Integer> keys = rooms.get(key);
            for (int i : keys) {
                if (!marks[i]) {
                    queue.offer(i);
                }
            }
        }
        for (boolean b : marks) {
            if (!b) {
                return false;
            }
        }
        return true;
    }

}
