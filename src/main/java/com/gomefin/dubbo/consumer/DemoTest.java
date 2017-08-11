package com.gomefin.dubbo.consumer;

public class DemoTest extends BaseClient{
    
    public static void main(String[] args) {
        testSayName();
    }
    
    public static void testSayName(){
        String name = "jianghe";
        String result = service.sayName(name);
        System.out.println(result);
    }

}
