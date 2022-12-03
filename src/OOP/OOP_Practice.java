package OOP;

public class OOP_Practice {
    String name="CSGO";
    int age=20;
    // 这是为了看远程库的互动加上的
    public void printHello(){
        System.out.println("Hello\t"+name);
    }
    public OOP_Practice(String name){
        this.name=name;
    }


    //one more commit
//    public OOP_Practice(){
//
//    }
    // What is OOP?(Object Orientated Program)===> Java, JavaScript,.Net(C#),C++,Python......
    //OOP=======> 面向对象(Object)

    // What is Class?
    /*
    OOP_Practice
    Class is bluePrint(类 是 蓝图)
    Class===>Fruit
    Object Apple, Banana, Orange....
     */
    // What is Object?
    /*
    Any instance under class field
    instance 1.Method(Function) 2. Variable
     */
    // How to invoke(调用) instance under you class?
    public static void main(String[] args) {
        // Create Object of  this class
        //ClassName objectName=new Constructor();
        OOP_Practice obj=new OOP_Practice("FIFA2023");
        System.out.println("Hello world"); //this is from zhangdefu
        obj.printHello();

    }

}
