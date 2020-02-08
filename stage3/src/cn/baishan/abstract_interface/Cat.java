package cn.baishan.abstract_interface;

/**
 * @author wangzhineng
 * @date 2020-02-08 - 20:32
 */
public class Cat extends Animal {

    public void eat(){
        System.out.println("小猫吃猫粮");
    }

    @Override
    public void jump() {
        System.out.println("小猫跳高");
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("小猫咪");
        cat.eat();
        cat.jump();
        Animal.sleep();
    }
}
