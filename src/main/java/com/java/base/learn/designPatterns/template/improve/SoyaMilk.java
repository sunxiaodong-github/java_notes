package com.java.base.learn.designPatterns.template.improve;

/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 20-5-15 上午11:43
 **/
public abstract class SoyaMilk {

    public final void make(){
        select();
        if (customerWantCondiments()) {
            addCondiments();
        }
        soak();
        beat();
    }

    private void select(){
        System.out.println("第一步：选择好的新鲜黄豆");
    }

    protected abstract void addCondiments();

    private void soak(){
        System.out.println("第三步，黄豆和配料开始浸泡，需要3小时");
    }

    private void beat(){
        System.out.println("第四步，黄豆和配料放到豆浆机去打碎");
    }

    // 钩子方法
    protected boolean customerWantCondiments(){
        return true;
    }
}
