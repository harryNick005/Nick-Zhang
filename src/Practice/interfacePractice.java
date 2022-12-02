package Practice;

public class interfacePractice implements baseInterface {

    @Override
    public String showContent(String input){
        return new String("this is content\t")+input;
    }
//
//    public static void main(String[] args) {
//        interfacePractice interfacePractice=new interfacePractice();
//        System.out.println(interfacePractice.showContent("Java"));
//    }

//    public static void main(String[] args) {
//        baseInterface objBaseInterface=new interfacePractice();
//        System.out.println(objBaseInterface.showContent("Java"));
//    }

//    public static void main(String[] args) {
//        baseInterface objBaseInterface=new baseInterface() {
//            @Override
//            public String showContent(String input) {
//                return new String("this is content\t")+input;
//            }
//        }; System.out.println(objBaseInterface.showContent("Java"));
//    }

    public static void main(String[] args) {
        baseInterface objBaseInterFace=(p)->{
          return new String("this is content\t")+p;
        };
        System.out.println(objBaseInterFace.showContent("java"));
    }
}
