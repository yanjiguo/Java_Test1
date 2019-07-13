package com.yjg.demo;
/**
 *  @author jiguo.yan@hand-china.com
 *  @date 2019/7/12
 *  @Description: java基础练习
 */
public class JavaDemo {
    public static void main(String[] args){
        //实例化一个猫
        Cat cat = new Cat("波斯猫","黄色");
        //实例化一个Dog
        Dog dog = new Dog("哈士奇","黑白");
        System.out.println(cat.getColor()+"----"+cat.getName());
        cat.eat();
        cat.sleep();
        cat.skill();
        System.out.println(dog.getColor()+"----"+dog.getName());
        dog.eat();
        dog.skill();
        dog.sleep();
        //多态
        Animal animal= new Cat();
        animal.eat();
        animal = new Dog();
        animal.eat();
        Animal an = new Cat("懒猫","黑色");
        System.out.println(an.getColor()+"----"+an.getName());
    }
}
