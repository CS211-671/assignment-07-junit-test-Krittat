package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserListTest {

    @Test
    @DisplayName("User should be found in UserList")
    public void testUserListFindUser() {
        // TODO: add 3 users to UserList
        UserList UU = new UserList();
        UU.addUser("DogEatCat1","CatIsDelicious1");
        UU.addUser("DogEatCat2","CatIsDelicious2");
        UU.addUser("DogEatCat3","CatIsDelicious3");
        // TODO: find one of them
        UU.findUserByUsername("DogEatCat1");
        // TODO: assert that UserList found User
        assertEquals("DogEatCat1",UU.findUserByUsername("DogEatCat1").getUsername());
        // String expected = "<one of username>";
        // String actual = user.getUsername();
        // assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User can change password")
    public void testUserCanChangePassword() {
        // TODO: add 3 users to UserList
        UserList UU = new UserList();
        UU.addUser("DogEatCat1","CatIsDelicious1");
        UU.addUser("DogEatCat2","CatIsDelicious2");
        UU.addUser("DogEatCat3","CatIsDelicious3");
        // TODO: change password of one user
        UU.changePassword("DogEatCat1","CatIsDelicious1","CatYummy1");
        // TODO: assert that user can change password
        boolean test = UU.findUserByUsername("DogEatCat1").validatePassword("CatYummy1");
        assertTrue(test);
    }

    @Test
    @DisplayName("User with correct password can login")
    public void testUserListShouldReturnObjectIfUsernameAndPasswordIsCorrect() {
        // TODO: add 3 users to UserList
        UserList UU = new UserList();
        UU.addUser("DogEatCat11","CatIsDelicious1");
        UU.addUser("DogEatCat22","CatIsDelicious2");
        UU.addUser("DogEatCat33","CatIsDelicious3");
        // TODO: call login() with correct username and password
        User actual = UU.login("DogEatCat11","CatIsDelicious1");
        // TODO: assert that User object is found
        User expected = UU.findUserByUsername("DogEatCat11");
         assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User with incorrect password cannot login")
    public void testUserListShouldReturnNullIfUsernameAndPasswordIsIncorrect() {
        // TODO: add 3 users to UserList
        UserList UU = new UserList();
        UU.addUser("DogEatCat11","CatIsDelicious1");
        UU.addUser("DogEatCat22","CatIsDelicious2");
        UU.addUser("DogEatCat33","CatIsDelicious3");
        // TODO: call login() with incorrect username or incorrect password
        User actual = UU.login("DogEatCat11","CatIsNotDelicious1");
        // TODO: assert that the method return null
         assertNull(actual);
    }

}