package cn.baishan.p2;

import cn.baishan.p1.Child;
import cn.baishan.p1.Father;

/**
 * @author wangzhineng
 * @date 2020-02-08 - 18:41
 */
public class Stanger2 {
    public static void main(String[] args) {
        Father father=new Father();
        System.out.println("father 实例访问："+father.param3);

        Child child = new Child();
        System.out.println("child 实例访问："+child.param3);

        Child2 child2 = new Child2();
        System.out.println("child2 实例访问："+child2.param3);
    }

}
