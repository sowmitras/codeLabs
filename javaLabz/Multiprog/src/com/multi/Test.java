package com.multi;

class A{
    int b=10;
    private A(){
          this.b=7;
    }
    int f(){
          return b;
    }
}
class B extends A{
    int b;
}
public class Test{
    public static void main(String[] args){
          A a = new B();
          System.out.println(a.f());
    }
}