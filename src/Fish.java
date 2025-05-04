public class Fish implements Prey, Predator
{

    @Override
    public void flee()
    {
        System.out.println("Fish flee");
    }

    public void hunt()
    {
        System.out.println("Fish hunt");
    }

}
