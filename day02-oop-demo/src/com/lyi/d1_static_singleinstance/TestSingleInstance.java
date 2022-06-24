package com.lyi.d1_static_singleinstance;

import com.sun.org.apache.xml.internal.res.XMLErrorResources_tr;

/**
 * @Description: TODO
 * @author: liu yi
 * @date: 2022年05月23日 19:16
 */
public class TestSingleInstance {
    public static void main(String[] args) {
        SingleInstance s =  SingleInstance.instance;
        SingleInstance s2 =  SingleInstance.instance;
        System.out.println(s==s2);
    }

}
