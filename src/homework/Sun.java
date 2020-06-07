package homework;

public class Sun extends Star implements Universe{

    public void around(){
        System.out.println("太阳吸引着九大行星旋转");
    }
    public void sports(){
        System.out.println("太阳光照八分钟，到达地球");
    }

    @Override
    public void doAnything() {

    }
}
