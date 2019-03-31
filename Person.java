public class Person //This is a class
{
    public String name;
    private int age;


    public Person(String name, int age)// constructor's name needs to be the same of the class name
    {
    this.name=name;
    this.age=age;
    }

    public void setAge(int age)
    {
        this.age=age;
    }


public String getName() 
{
    return name;
}

public int getAge()
{
    return age;
}

}