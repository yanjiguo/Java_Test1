1.体现出封装，继承，多态的特点。
	在设计Demo的过程中，代码中首先创建创建三个类分别是Animal类、Cat类、Dog类。在Animal类中定义两个字段分别是name和color并且私有化对外提供set和get方法，
     这样的写法满足了封装的基本概念，同时将动物中共有的方法抽象出来分别是eat()和sleep()。在定义Cat类和Dog类的时候分别让他们继承Animal类，并且必须重写
     eat()和sleep()方法，同时Cat和Dog也会有name和color因此在继承父类后同样拥有父类中字段，但是父类中的字段是私有的因此子类能够访问到是因为子类继承了父类中
     公共的set和get方法。而在测试的过程中创建一个Animal an 同时指向Cat和Dog两个对象，并且可以调用各自子类的方法。这既是一个引用的不同表示方式（也就是多态）。
2.上下界通配符
	限定通配符总是包括自己
	上界类型通配符：add方法受限，get可以
	下界类型通配符：get方法受限，add可以
	如果你想从一个数据类型里获取数据，使用 ? extends 通配符
	如果你想把对象写入一个数据结构里，使用 ? super 通配符
	如果你既想存，又想取，那就别用通配符
	不能同时声明泛型通配符上界和下界
	在设计上下界通配符时，首先根据概念中，在往一个集合中添加数据的时候可以使用下届通配符来实现，
	新建一个ArrayList集合（空的），在不知道添加的内容是什么的时候制定一个大的数据类型，只要添加的数据类型比它小就可以。