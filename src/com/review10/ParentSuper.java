package com.review10;

class ParentSuper{
    String Parent="parent";
    
    ParentSuper(){
        System.out.println("parent");
    }
    void hello() {
        System.out.println("hello world");
    }
    
}

 class SuperKeyword extends ParentSuper{
    String Parent="Child";
    
    void hello() {
    super.hello();
    }
    
    SuperKeyword(){
        super();
        System.out.println("child");

    }
    
    public static void main(String[] args) {
        SuperKeyword superKey=new SuperKeyword();
        superKey.hello();
    }

}