package cn.baishan.p2;

import cn.baishan.p1.Father;

/**
 * @author wangzhineng
 * @date 2020-02-08 - 18:25
 */
public class Child2 extends Father {
    public static void main(String[] args) {
        Father father = new Father();
        System.out.println(father.param3);

        Child2 child2 = new Child2();
        System.out.println(child2.param2);
    }
}
