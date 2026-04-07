package exercice1;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class UserServiceTest {

    @Test
    void testGetUserById() {

        // mock
        UserRepository repo = mock(UserRepository.class);

        // fake data
        User user = new User(1, "Aicha");

        // comportement
        when(repo.findUserById(1)).thenReturn(user);

        // service
        UserService service = new UserService(repo);

        // appel
        User result = service.getUserById(1);

        // verification
        assertEquals("Aicha", result.getName());


        verify(repo).findUserById(1);
    }
}