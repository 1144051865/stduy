package cn.baishan.p1;

/**
 * @author wangzhineng
 * @date 2020-02-08 - 18:16
 */
public class Child extends Father{

        public static void main(String[] args) {
            Father father = new Father();
            System.out.println(father.param2);
            System.out.println(father.param3);
            System.out.println(father.param4);
//            System.out.println(father.param1);

            Child child = new Child();

            System.out.println(child.param2);
            System.out.println(child.param3);
//            System.out.println(child.param1);
            System.out.println(child.param4);
        }

}
