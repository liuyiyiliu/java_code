package com.lyi.d2_stream_test;

import com.sun.org.apache.xml.internal.res.XMLErrorResources_tr;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Stream;

/**
 * @Description: TODO
 * @author: liu yi
 * @date: 2022年06月04日 8:36
 */
public class Test {
    /**
     * 需求整理
     *  1.分别筛选出2个部门的最高工资的员工信息，封装成优秀员工对象 Topperformer
     *  2.分别统计2个部门的平均月收入，要求去掉最高和最低工资
     *  3.统计2个开发部门整体的平均工资，去掉最低和最高工资的平均值
     */
    public static Double allMoney = 0.0; //开发一部员工工资
    public static Double allMoney2 = 0.0; //两个部门其他员工之和



    public static void main(String[] args) {
        ArrayList<Employee> depart = new ArrayList<>();
        Employee employee = new Employee("孙悟空", '男', 500.0, 300.0, "null");
        Employee employee2 = new Employee("猪八戒", '男', 600.0, 150.0, "null");
        Employee employee3 = new Employee("唐僧", '男', 700.0, 40.0, "null");
        Employee employee4 = new Employee("白龙马", '男', 400.0, 300.0, "null");
        Collections.addAll(depart,employee,employee2,employee3,employee4);
//        System.out.println(depart);

        ArrayList<Employee> depart2 = new ArrayList<>();
        Employee employee5 = new Employee("严贵宝", '男', 20000, 300.0, "null");
        Employee employee6 = new Employee("王明江", '男', 19000, 150.0, "null");
        Employee employee7 = new Employee("刚哥", '男', 21000, 40.0, "null");
        Employee employee8= new Employee("me", '男', 8000.0, 300.0, "null");
        Employee employee9 = new Employee("尚和生", '男', 1500.0, 100.0, "null");
        Collections.addAll(depart2,employee,employee2,employee3,employee4,employee5);
        System.out.println(depart2);
//        1.分别筛选出2个部门的最高工资的员工信息，封装成优秀员工对象 Topperformer 通过流的map()加装对象
        Topperformer topDepart;
        topDepart = depart.stream().max((o1, o2) -> Double.compare((o1.getSalary() + o1.getBonus()), (o2.getSalary() + o2.getBonus())))
                .map(e-> new Topperformer(e.getName(),e.getSalary()+e.getBonus())).get();
        System.out.println(topDepart);
        Topperformer topDepart2;

        topDepart2 = depart2.stream().max((o1, o2) -> Double.compare((o1.getSalary() + o1.getBonus()), (o2.getSalary() + o2.getBonus())))
                .map(e-> new Topperformer(e.getName(),e.getSalary()+e.getBonus())).get();
        System.out.println(topDepart2);

//        2.分别统计2个部门的平均月收入，要求去掉最高和最低工资

//        定义开发一部其他员工的工资总和 因为是定义的方法当中 所以要定义 成员变量
        depart.stream().sorted((o1, o2) -> Double.compare((o1.getSalary() + o1.getBonus()), (o2.getSalary() + o2.getBonus())))
                .skip(1).limit(depart.size()-2).forEach(e-> {
                    allMoney += (e.getSalary() + e.getBonus());
        });
        System.out.println(allMoney);
        System.out.println("开发一部的平均工资:"+ (allMoney/(depart.size()-2)));
//        同理 开发二部

//        合并两个流 对象
        Stream<Employee> stream = depart.stream();
        Stream<Employee> stream1 = depart2.stream();
        Stream<Employee> allDepart = Stream.concat(stream,stream1);
        allDepart.sorted((o1, o2) -> Double.compare((o1.getSalary() + o1.getBonus()), (o2.getSalary() + o2.getBonus())))
                .skip(1).limit(depart.size()+ depart2.size()-2).forEach(e-> {
            allMoney2 += (e.getSalary() + e.getBonus());
        });
        System.out.println("开发部门整体平均工资:" + allMoney2/(depart.size()+depart2.size()-2));


//        大数据指定精度
        BigDecimal b = BigDecimal.valueOf(allMoney2);
        BigDecimal number = BigDecimal.valueOf(depart.size()+depart2.size()-2);
        System.out.println("开发部门整体平均工资:" + b.divide(number,BigDecimal.ROUND_HALF_UP));


    }
}
