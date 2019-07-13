package com.yjg.demo;

/**
 *  @author jiguo.yan@hand-china.com
 *  @date 2019/7/12
 *  @Description: 狗的基本属性类
 */
public class Dog extends Animal{
    /**
     * 空参构造
     */
    public Dog(){}

    /**
     *
     * @param name
     * @param color
     */
    public Dog(String name, String color) {
        //继承父类的中的姓名和颜色字段
        super(name, color);
    }
    /**
     * 重写吃和sleep的方法
     */
    @Override
    public void eat(){
        System.out.println("狗自己具体的吃，吃骨头");
    }
    @Override
    public void sleep(){
        System.out.println("狗窝着睡");
    }
    /**
     * 狗还有自己的方法
     */
    public void skill(){
        System.out.println("狗逮兔子");
    }
}
