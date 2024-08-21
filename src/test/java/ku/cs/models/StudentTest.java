package ku.cs.models;
import ku.cs.models.Student;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    @Test
    void testAddScore(){
        Student s1 = new Student("6xxxxxxxx", "jjjjj");
        s1.addScore(45.15);
        assertEquals(45.15, s1.getScore());

    }

    @Test
    void    testCalculateGrade(){
        Student s1 = new Student("6xxxxxxxx", "jjjjj");
        s1.addScore(60.0);
        assertEquals("C",s1.grade());
    }

    @Test
    void testChangeName(){
        Student s1 = new Student("6xxxxxxxx", "jjjjj");
        s1.changeName("isara");
        assertEquals("isara",s1.getName());
    }

    @Test
    void testIsID(){
        Student s1 = new Student("6xxx", "jjjjj");
        assertTrue(s1.isId("6xxx"));
    }

}
