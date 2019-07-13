package com.yjg.demo;
/**
 *  @author jiguo.yan@hand-china.com
 *  @date 2019/7/12
 *  @Description: 对于所有的动物的抽象类
 */
 public abstract class Animal {
    /**
     * 姓名
     */
    private String name;
    /**
     * 颜色
     */
    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    /**
     * 空参构造
     */
    public Animal() {

    }
    /**
     * 有参构造方法
     */
    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
    /**
     * 所有动物都有吃和睡觉，但是动物的吃和sleep又不能具体的描述，因此抽象出来让子类去具体实现
     */
     abstract void eat();
     abstract void sleep();
}
