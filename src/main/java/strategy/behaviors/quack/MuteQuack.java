package strategy.behaviors.quack;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("ovozsiz");
    }
}
