package com.java.base.learn.designPatterns.prototype;

import java.io.*;

/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 20-4-26 上午2:39
 **/
public class DeepProtoType implements Serializable, Cloneable {

    private static final long serialVersionUID = -6877855129734221865L;
    public String name;
    // 引用类型
    public DeepCloneableTarget deepCloneableTarget;

    public DeepProtoType() {
        super();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep = null;
        // 完成对基本数据类型（属性）和string的克隆
        deep = super.clone();
        // 对引用数据类型的属性，进行单独的处理
        DeepProtoType deepProtoType = (DeepProtoType) deep;
        deepProtoType.deepCloneableTarget = (DeepCloneableTarget) deepCloneableTarget.clone();
        return deepProtoType;
    }

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
}
