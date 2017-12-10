package com.crazyjava3.chapter6;

/**
 * TODO completion javadoc.
 *
 * @author xuzhongming
 * @since 06 八月 2017
 */
public class OverrideEqualsRight {

    public static void main(String[] args){
        Person p1=new Person("孙悟空","1234");
        Person p2=new Person("孙行者","1234");
        Person p3=new Person("孙悟饭","12345");
        System.out.println(p1.equals(p2));
        System.out.println(p2.equals(p3));
    }
}

class Person{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdStr() {
        return idStr;
    }

    public void setIdStr(String idStr) {
        this.idStr = idStr;
    }

    private String idStr;
    public Person(){}
    public Person(String name,String idStr){
        this.name=name;
        this.idStr=idStr;
    }
    public boolean equals(Object obj){
        if(this==obj)
            return true;
        if(obj!=null&&obj.getClass()==Person.class){
            Person person=(Person)obj;
            if(this.getIdStr().equals(person.getIdStr())){
                return true;
            }
        }
        return false;
    }
}