package com.p1;
class Test{
    int i=10;
    public void disp(){
            System.out.println("i val is.."+i);
    }
}
public class ClientTest {
    public static void main(String[] args) {
            Test t=null;
            t.disp();
    }
}