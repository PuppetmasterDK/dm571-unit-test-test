import spock.lang.Ignore
import spock.lang.Specification


// tag::ignore[]
@Ignore
class Dm571SpockPersonSpec extends Specification {
// end::ignore[]

    class Person {
        protected int birthYear
        protected String name;

        Person(int birthYear, String name) {
            this.birthYear = birthYear
            this.name = name
        }

        int getBirthYear() {
            return birthYear
        }

        String getName() {
            return name
        }

        @Override
        String toString() {
            return name + ' is born in ' + birthYear;
        }
    }

    // tag::personTestConstructor[]
    def "test a Person with name '#name' and age '#birthYear'"() {
        // TODO: Test that you can construct a new instance and get the correct name and birthYear
    }
    // end::personTestConstructor[]

    // tag::personTestToString[]
    def "test that the toString method gives a nicely formatted representation ('#name', '#birthYear')"() {
        // TODO: Test that toString method gives the expected and correct output
    }
    // end::personTestToString[]


}
