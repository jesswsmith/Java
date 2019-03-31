public class Example // this is main class
{
    public static void main(String [] args)
    {
       Person object1 = new Person("Victor",27);

       Person object2 = new Person("Marian",30);

       Employee e1 = new Employee("Jordan",26,120000);

       Jess j1 = new Jess("Jess",29,1000);
    

       System.out.println(e1.getName());

       Animal animal1=new Animal("OP froggy");

       animal1.attack(object1.getName());

       j1.eats(animal1.getName());

    }
}