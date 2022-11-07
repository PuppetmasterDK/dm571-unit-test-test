
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