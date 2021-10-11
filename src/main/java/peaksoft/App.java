package peaksoft;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Animal animal = context.getBean("myAnimal",Animal.class);
        System.out.println(animal);


        Person person = context.getBean("myPerson",Person.class);
        System.out.println(person);
        person.getAnimal().animalMinus();
    }
}
