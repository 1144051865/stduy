package cn.baishan.p1;

/**
 * @author wangzhineng
 * @date 2020-02-08 - 18:07
 */
public class Father {
    private String param1 ="这是private";
    protected String param2 ="这是protected";
    public String param3 = "这是public";
    String param4 ="这是default";

    public static void main(String[] args) {
        Father father = new Father();
        System.out.println(father.param1);
        System.out.println(father.param2);
        System.out.println(father.param3);
        System.out.println(father.param4);
    }
}
