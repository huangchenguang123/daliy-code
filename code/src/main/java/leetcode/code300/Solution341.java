package leetcode.code300;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author huangchenguang
 * @date 2022/10/9 11:15
 * @desc 扁平化的嵌套列表迭代器
 */
public class Solution341 implements Iterator<Integer> {

    private interface NestedInteger {

        public boolean isInteger();

        public Integer getInteger();

        public List<NestedInteger> getList();

    }

    private final Iterator<Integer> proxy;

    /**
     * @date 2022/10/9 11:27
     * @author huangchenguang
     * @desc dfs遍历，将这个列表扁平化展开，并且创建一个iterator，外部的类仅作为接口代理请求到真实的iterator
     */
    public Solution341(List<NestedInteger> nestedList) {
        List<Integer> result = getList(nestedList);
        proxy = result.iterator();
    }

    private List<Integer> getList(List<NestedInteger> nestedList) {
        List<Integer> result = new LinkedList<>();
        for (NestedInteger integer : nestedList) {
            if (integer.isInteger()) {
                result.add(integer.getInteger());
            } else {
                result.addAll(getList(integer.getList()));
            }
        }
        return result;
    }

    @Override
    public Integer next() {
        return proxy.next();
    }

    @Override
    public boolean hasNext() {
        return proxy.hasNext();
    }

}
