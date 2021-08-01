class Inheritance{
    public static void main(String a[])
    {
        Person p1= new Person(22, "Vishal");
        
        p1.walk();

        Developer d1= new Developer(20, "rock");
        d1.walk(5);
        d1.code();
    }
}

class Person
{
    int age; 
    String name;

    public Person(int age, String name)
    {
        this.age= age;
        this.name= name;
    }

    public void walk()
    {
        System.out.println(name + " is walking");
    }
}

class Developer extends Person
{
    public Developer(int age, String name)
    {
        //we are inheriting the properties of Person
        //so we need to have age and name
        //super will call its parent class's constructor 
        super(age, name);
    }

    public void walk(int steps)
    {
        System.out.println(name +" has walked " + steps +" steps");
    }

    public void code()
    {
        System.out.println(name+ " is coding");
    }
}