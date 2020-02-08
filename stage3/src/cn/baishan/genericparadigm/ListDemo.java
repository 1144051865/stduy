package cn.baishan.genericparadigm;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangzhineng
 * @date 2020-02-08 - 20:00
 */
public class ListDemo {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setAge(18);
        p1.setName("wangzhineng");
        Person p2 = new Person();
        p2.setAge(19);
        p2.setName("xx");
        List<Person> list = new ArrayList<Person>();
        list.add(p1);
        list.add(p2);
        for (Person person : list) {
            System.out.println(person);
        }

    }
}
