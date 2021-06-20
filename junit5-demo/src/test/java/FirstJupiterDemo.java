import org.junit.jupiter.api.*;

@DisplayName("first class")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class FirstJupiterDemo {
    private int value = 3;

    @Test
    @DisplayName("first unit test")
    @Order(3)
    void firstTest() {
        System.out.println("first test" + value);
        value++;
        Assertions.assertEquals(1, 1);

        Assumptions.assumeFalse("CI".equals(System.getenv("ENV")));
    }

    @Test
    @Order(1)
    void secondTest() {
        System.out.println("second test" + value);
        value++;
    }

    @Test
    @Order(2)
    void thirdTest() {
        System.out.println("third test" + value);
        value++;
    }


    @BeforeAll
    static void beforeAll() {
        System.out.println("before all");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("before each");
    }
}
