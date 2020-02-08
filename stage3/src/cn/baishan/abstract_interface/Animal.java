package cn.baishan.abstract_interface;

/**
 * @author wangzhineng
 * @date 2020-02-08 - 20:26
 */
public abstract class Animal {

    private String name;

    public void eat(){
        System.out.println("进食");
    }

    public static void sleep(){
        System.out.println("睡觉");
    }

    public abstract void jump();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
