public class Jess extends Person
{
    private double cookies;

    public Jess(String name, int age, double cookies)
    {
        super(name,age);
        this.cookies=cookies;
    }

    public double getCookies()
    {
        return cookies;
    }
    public void setCookies(double cookies)
    {
        this.cookies=cookies;
    }
    public void eats(String n)
    {
        System.out.println(this.name+" eats "+n);
    }
}