package com.lyi.d2_final_code;

/**
 * @Description: TODO
 * @author: liu yi
 * @date: 2022年05月24日 9:18
 */
public  class People {
    private String name;
    private int age;

    public People() {
    }

    public final void sleep(){
        System.out.println("睡觉了");
    }

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
