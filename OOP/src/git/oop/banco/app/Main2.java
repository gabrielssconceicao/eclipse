package git.oop.banco.app;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import git.oop.banco.modelo.Person;

public class Main2 {

  public static void main(String[] args) {
    Person person = new Person("Joao", "123456789");
    Person person2 = new Person("Maria", "14645");

    // Set<Person> lista = new HashSet<>();
    // lista.add(person);
    // lista.add(person2);
    // System.out.println(lista.contains(person2));
    // System.out.println(person.hashCode());
    // System.out.println(person2.hashCode());
    // for (Person p : lista) {
    // System.out.println(p.getName());
    // }
    // for (Person p : lista) {
    // System.out.println(p.getName());
    // }
    // List<Person> lista = new ArrayList<>();
    // System.out.println(lista.toString());

    // Person p3 = lista.get(1);
    // Person p4 = new Person("Ana", "4645");

    // System.out.println(p3.toString());

    // System.out.println(p3.equals(person));
    // System.out.println(p4.equals(person2));
  }

}
