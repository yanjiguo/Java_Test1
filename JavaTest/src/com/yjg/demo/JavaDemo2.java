package com.yjg.demo;

import java.util.ArrayList;
import java.util.List;

/**
 *  @author jiguo.yan@hand-china.com
 *  @date 2019/7/13
 *  @Description:下界通配符的demo
 */
public class JavaDemo2 {
    public static void main(String[] args) {
        /**
         * 测试上通配符
         */
        /*firstPrint();
        secondPrint();*/
        /**
         * 测试下通配符
         */
        List<Number> list = new ArrayList<>();
        firstInflate(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        /**
         * 清除List集合中的数据
         */
        list.clear();
        secondInflate(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    /**
     * 上边界限定通配符
     *
     */
    public static void firstPrint() {
        /**
         * 使用 Float作实参类型
         */
        List<Float> list1 = new ArrayList<>();
        list1.add(12.3f);
        list1.add(23.4f);
        print(list1);
    }

    public static void secondPrint() {
        /**
         * 使用Integer作实参类型
         */
        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        print(list2);
    }
    /**
     * 通配符作形参
     * List的参数只要满足是Number的子类就可以
     * @param list
     */
    public static void print(List<? extends Number> list) {
        for (int i = 0; i < list.size(); i++) {
            /**
             * 使用get方法
             */
            System.out.println(list.get(i));
        }
    }

    /**
     * 下边界限定通配符
     * 添加整数
     * @param list
     */
    public static void firstInflate(List<? super Integer> list) {
        list.add(1);
        list.add(2);
        list.add(3);
    }

    /**
     * 添加浮点数
     * @param list
     */
    public static void secondInflate(List<? super Float> list) {
        list.add(1.1f);
        list.add(2.2f);
        list.add(1.3f);
    }
}
