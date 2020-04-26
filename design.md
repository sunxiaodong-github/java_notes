## 设计模式

### 单例模式
> 单例模式注意事项和细节说明

* 单例模式保证了系统内存中只存在一个对象，节省了系统资源，对于一些需要频繁创建销毁的对象，使用单例模式可以提高系统性能；
* 当想实例化一个单例的时候，必须要记住使用相应的获取对象的方法，而不是使用new；
* 单例模式使用场景：需要频繁的进行创建和销毁的对象、创建对象时耗时过多或耗资源过多（即：重量级对象），但又经常用到的对象、**工具类对象**、频繁访问数据库或文件的对象（比如：**数据源、session工厂**等）。

### 工厂模式
> 抽象工厂模式

* 抽象工厂模式：定义了一个interface用于创建相关或有依赖关系的对象簇，而无需指明具体的类
* 抽象工厂模式可以将简单工厂模式的改进（或者称为进一步的抽象）。
* 从设计层面看，抽象工厂模式就是对简单工厂模式的改进（或者称为进一步的抽象）。
* 将工厂抽象成两层，AbstractFactory和具体实现的工厂子类。程序员可以根据创建对象类型使用对应的工厂子类。这样将单个的简单工厂类型变成了工厂簇，更利于代码的维护和扩展。

### 原型模式 （浅拷贝、深拷贝）
1. 原型模式是指：用原型实例指定创建对象的种类，并且通过再拷贝这些原型，创建新的对象
2. 原型模式是一种创建型设计模式，允许一个对象再创建另外一个可定制的对象，无需知道如何创建细节
3. 工作原理是通过将一个原型对象传给那个要发动创建对象，这个要发动创建的对象通过请求原型对象拷贝它们自己来实现创建，即：对象.clone()

> 原理结构

1. ProtoType：原型类，声明克隆自己的接口
2. ConcretePrototype：具体的原型类，实现一个克隆自己的操作
3. Client：让一个原型对象克隆自己，从而创建一个新的对象（属性一样）

**浅拷贝是使用默认的clone()方法实现的**

> 深拷贝

1. 复制对象的所有基本数据类型的成员变量值
2. 为所有引用数据类型的成员变量申请存储空间，并复制每个引用数据类型成员变量所引用的对象，直到该对象可达的所有对象。也就是说，对象进行深拷贝要对整个对象进行可拷贝
3. 深拷贝实现方式：重写clone方法来实现深拷贝
4. 深拷贝实现方式：通过对象序列化实现深拷贝（推荐）

```
// 推荐： 深拷贝 通过对象的序列化
    public Object deepClone(){
        // 创建对象
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        DeepProtoType copy = null;
        try {
            // 序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            // 反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            copy = (DeepProtoType) ois.readObject();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return copy;
    }
```

* 创建新的对象比较复杂的时候，可以利用原型模式简化对象的创建过程，同时也能提供效率
* 不用重新初始化对象，而是动态的获得对象运行时的状态
* 如果原始对象发生变化（增加或者减少属性），其他克隆对象的也会发生相应的变化，无需修改代码
* 在实现深克隆的时候可能需要比较复杂的代码
* 缺点：需要为每一个类配备一个克隆方法，这对全新的类来说不是很难，但是对已有的类进行改造时，需要修改其源码，违背ocp原则，这点需要注意。
