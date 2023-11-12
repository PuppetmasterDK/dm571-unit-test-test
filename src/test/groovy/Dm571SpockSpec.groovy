import spock.lang.Specification
import spock.lang.Unroll

class Dm571SpockSpec extends Specification {

    // tag::plusOperatorTest[]
    def "test +-operator"() {
        given: "two inputs"
            int a = 2
            int b = 4

        when: "we do a + b"
            int result = a + b

        then: "we expect the right result"
            result == 6
    }
    // end::plusOperatorTest[]

    // tag::lowercaseTest[]
    def "test lowercase"() {
        // TODO: Make a test that tests the .toLowerCase() method
    }
    // end::lowercaseTest[]


    // tag::lowercaseTestDataDriven[]
    @Unroll("Two strings '#a' and '#b'")
    def "test lowercase with data"() {
        // TODO: Make a test that tests the .toLowerCase() method using a Data Tables
        // TODO: Hint: Look here: https://spockframework.org/spock/docs/2.3/data_driven_testing.html at the Data Tables section ;)
    }
    // end::lowercaseTestDataDriven[]


}
