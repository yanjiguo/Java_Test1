package com.yjg.demo;
/**
 *  @author jiguo.yan@hand-china.com
 *  @date 2019/7/13
 *  @Description: java断言练习和线程的练习
 */

//public class Main {
   /* public static void main(String[] args) {
        断言1结果为true，则继续往下执行
        assert true;
        System.out.println("断言1没有问题，Go！");

        System.out.println("\n-----------------\n");

        //断言2结果为false,程序终止
        assert false : "断言失败，此表达式的信息将会在抛出异常的时候输出！";
        System.out.println("断言2没有问题，Go！");
    }*/

/**
 * 1）继承Thread类创建线程
 *
 * 2）实现Runnable接口创建线程
 *
 * 3）使用Callable和Future创建线程
 *
 * 4）使用线程池例如用Executor框架
 */
class SynchronizedTest implements Runnable {
    //共享资源
    static int i = 0;

    /**
     * synchronized 修饰实例方法
     */
    public synchronized void increase() {
        i++;
    }

    @Override
    public void run() {
        for (int j = 0; j < 10000; j++) {
            increase();
        }
    }
    public static void main(String[] args) throws InterruptedException {
        SynchronizedTest test = new SynchronizedTest();
        Thread t1 = new Thread(test);
        Thread t2 = new Thread(test);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        /**
         * 不使用synchronized17504使用synchronized20000
         */
        System.out.println(i);
    }
}
