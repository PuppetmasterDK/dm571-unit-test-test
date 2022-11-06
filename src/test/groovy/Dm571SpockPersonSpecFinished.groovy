import spock.lang.Ignore
import spock.lang.Specification
import spock.lang.Unroll

@Ignore
class Dm571SpockPersonSpecFinished extends Specification {

    class Person {
        protected int age
        protected String name;

        Person(int age, String name) {
            this.age = age
            this.name = name
        }

        int getAge() {
            return age
        }

        String getName() {
            return name
        }

        @Override
        String toString() {
            return name + ' is ' + age + ' year' + (age == 0 ? 's' : '') + ' old';
        }
    }

    def "test a Person with name '#name' and age '#age'"() {
        given: "#name and #age"

        when: "we instantiate a new instance of Person"
            Person p = new Person(age, name)

        then: "the name and age must match"
            age == p.age
            name == p.name

        where:
        name        | age
        'Carsten'   | 34
        'Henriette' | 37
        'Mira'      | 6
        'Sebastian' | 9
    }

    def "test that the toString method gives a nicely formatted representation ('#name', '#age')"() {
        given: "#name and #age"

        when: "we instantiate a new instance of Person"
            Person p = new Person(age, name)

        then: "we expect a nicely formatted string"
            "$name is $age year" + (age == 0 ? 's':'') + " old" == p.toString()

        where:
        name        | age
        'Bent'      | 0
        'Berrit'    | 1
        'Preben'    | -1
    }


}
