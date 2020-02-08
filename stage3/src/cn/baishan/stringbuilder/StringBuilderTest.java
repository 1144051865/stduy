package cn.baishan.stringbuilder;

/**
 * @author wangzhineng
 * @date 2020-02-08 - 19:13
 */
public class StringBuilderTest {

    public static void main(String[] args) {
        String str1 = "a";
        String str2 = "b";
        String str3 = str1 + str2;
        System.out.println(str3 == str2);

        StringBuilder sb1 = new StringBuilder("a");
        StringBuilder sb2 = new StringBuilder("b");
        StringBuilder sb3 = sb1.append(sb2);
        System.out.println(sb3);
        System.out.println(sb3==sb2);
        System.out.println(sb3==sb1);
    }


}
