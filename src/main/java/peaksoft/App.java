package peaksoft;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Person person = context.getBean("myPerson",Person.class);
        System.out.println(person);
        person.getAnimal().animalMinus();


        Animal animal = context.getBean("myAnimal",Animal.class);
//        System.out.println(animal);
    }
}
