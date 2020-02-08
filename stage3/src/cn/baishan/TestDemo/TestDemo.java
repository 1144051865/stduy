package cn.baishan.TestDemo;

import cn.baishan.genericparadigm.Person;
import org.junit.Test;

/**
 * @author wangzhineng
 * @date 2020-02-08 - 20:50
 */
public class TestDemo {

    @Test
    public void fun1(){
        Person person = new Person();
        person.setName("wzn");
        person.setAge(22);
        System.out.println(person);
    }

}
