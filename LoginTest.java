import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LoginTest {
    private Login login;

    @BeforeEach
    public void setUp() {
        login = new Login("gift", "Ndlovu");
    }

    @Test
    public void testUsernameCorrectlyFormatted() {
        assertTrue(login.checkUserName("nd_25"));
    }

    @Test
    public void testUsernameIncorrectlyFormatted() {
        assertFalse(login.checkUserName("kyle!!!!!!"));
    }

    @Test
    public void testPasswordMeetsComplexity() {
        assertTrue(login.checkPasswordComplexity("Ndlovu@25"));
    }

    @Test
    public void testPasswordFailsComplexity() {
        assertFalse(login.checkPasswordComplexity("password"));
    }

    @Test
    public void testCellPhoneNumberCorrectlyFormatted() {
        assertTrue(login.checkCellPhoneNumber("+27600102013"));
    }

    @Test
    public void testCellPhoneNumberIncorrectlyFormatted() {
        assertFalse(login.checkCellPhoneNumber("08966553"));
    }

    @Test
    public void testLoginSuccessful() {
        login.registerUser("nd_25", "Ndlovu@25", "+27600102013");
        assertTrue(login.loginUser("nd_25", "Ndlovu@25"));
    }

    @Test
    public void testLoginFailed() {
        login.registerUser("nd_25", "Ndlovu@25", "+27600102013");
        assertFalse(login.loginUser("wrong_user", "wrong_pass"));
    }

    @Test
    public void testReturnLoginStatusSuccess() {
        String expected = "Welcome gift Ndlovu, it is great to see you again.";
        String actual = login.returnLoginStatus(true);
        assertEquals(expected, actual);
    }

    @Test
    public void testReturnLoginStatusFailure() {
        String expected = "Username or password incorrect, please try again.";
        String actual = login.returnLoginStatus(false);
        assertEquals(expected, actual);
    }
}
