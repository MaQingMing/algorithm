package 继承;

/**
 * @author mqm
 * @version 1.0
 * @date 2024/4/12 14:56
 */
public class Devied extends Base {

    @Override
    public void methodOne(){
        super.methodOne();
        System.out.println("C");

    }

    @Override
    public void methodTwo(){
        super.methodTwo();
        System.out.println("D");
    }
}
