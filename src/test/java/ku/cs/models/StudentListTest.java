package ku.cs.models;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

public class StudentListTest {

    StudentList list1;
    @BeforeEach
    void init(){
        list1 = new StudentList();
        list1.addNewStudent("666","DogEnjoyeatingCat");
    }

    @Test
    void testAddStudent(){
        list1.addNewStudent("66666666","DogeatCat");
        assertEquals(2,list1.getStudents().size());
    }

    @Test
    void testFindByID(){
        assertEquals("666",list1.findStudentById("666").getId());
    }

    @Test
    void testGiveScoreToId(){
        list1.giveScoreToId("666",70);
        assertEquals(70,list1.findStudentById("666").getScore());
    }

    @Test
    void testViewGradeOfId(){
        list1.addNewStudent("677","DogeatCat",60);
        list1.viewGradeOfId("677");
        assertEquals("C",list1.findStudentById("677").grade());
    }



}
