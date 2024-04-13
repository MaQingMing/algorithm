package 继承;

/**
 * @author mqm
 * @version 1.0
 * @date 2024/4/12 14:55
 */
public class Base {

    public void methodOne(){
        System.out.println("A");
        methodTwo();
    }

    public void methodTwo(){
        System.out.println("B");
    }
}
