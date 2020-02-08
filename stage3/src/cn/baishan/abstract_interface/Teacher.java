package cn.baishan.abstract_interface;

/**
 * @author wangzhineng
 * @date 2020-02-08 - 20:47
 */
public class Teacher implements Person {
    @Override
    public void eat() {

    }

    @Override
    public void travel() {

    }

    public int noOfLegs(){
        return 0;
    }

    public static void main(String args[]){
        Teacher teacher = new Teacher();
        teacher.eat();
        teacher.travel();
    }
}
