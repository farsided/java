package core;
import java.util.*;

public abstract class Person {
    Name firstName;
    Name middleName;
    Name lastName;
    Name extensionName;

    Date birthDate;
    Person mother;
    Person father;

    String uniqueID = UUID.randomUUID().toString();

    Person(){}
    ;
    Person(String firstName, String middleName, String lastName, String extensionName){
        this.firstName = new Name(firstName) {};
        this.middleName = new Name(middleName) {};
        this.lastName = new Name(lastName) {};
        this.extensionName = new Name(extensionName) {};
    }

    String GetFullName(){
        return String.join(
                " ",
                firstName.Get(),
                middleName.Get(),
                lastName.Get(),
                extensionName.Get()
        );
    }

    int Save(){ return 0; };
    int Create(){ return 0; };
    int Delete() { return 0; };
    Person Search() { return new Person (){}; } ;
    


}

class Employee extends Person {

    Employee(String firstName, String middleName, String lastName, String extensionName) {
        super(firstName, middleName, lastName, extensionName);
    }

    Employee(){
    }

    int Create() {
        return 0;
    }

    int Save() {
        return 0;
    }

    int Delete(){
        return 0;
    }

    Person Search() {
        return null;
    }



    Collection<Person> Collection() {
        return List.of();
    }
}

class Main{
    public static void main(String[] args){
        Person p = new Employee("Jose", "Lamud", "Montenegro", "Jr"){
            {
                System.out.println(firstName.Get());
            }
        };

        System.out.println(p.firstName.Get());
    }
}

class Customer extends Person {

}