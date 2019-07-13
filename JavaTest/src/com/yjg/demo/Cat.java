package com.yjg.demo;
/**
 *  @author jiguo.yan@hand-china.com
 *  @date 2019/7/12
 *  @Description: 猫的基本属性类
 */
public class Cat extends Animal{
    /**
     * 空参
     */
    public Cat(){
        super();
    }
    /**
     *
     * @param name
     * @param color
     */
    public Cat(String name, String color) {
        super(name, color);
    }
    /**
     * 重写吃和sleep的方法
     */
    @Override
    public void eat(){
        System.out.println("猫自己具体的吃，吃鱼");
    }
    @Override
    public void sleep(){
        System.out.println("猫躺着睡");
    }
    /**
     * 猫自己独有的方法
     */
    public void skill(){
        System.out.println("猫捉老鼠");
    }
}
