package hw4.hash;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
<<<<<<< HEAD
import java.util.Set;
import java.util.HashSet;
=======
>>>>>>> ea721d79cb8f8c9d8fb51240be7a069e543ed26b

public class TestComplexOomage {

    @Test
    public void testHashCodeDeterministic() {
        ComplexOomage so = ComplexOomage.randomComplexOomage();
        int hashCode = so.hashCode();
        for (int i = 0; i < 100; i += 1) {
            assertEquals(hashCode, so.hashCode());
        }
    }

    /* This should pass if your OomageTestUtility.haveNiceHashCodeSpread
       is correct. This is true even though our given ComplexOomage class
       has a flawed hashCode. */
    @Test
    public void testRandomOomagesHashCodeSpread() {
        List<Oomage> oomages = new ArrayList<>();
        int N = 10000;

        for (int i = 0; i < N; i += 1) {
            oomages.add(ComplexOomage.randomComplexOomage());
        }

        assertTrue(OomageTestUtility.haveNiceHashCodeSpread(oomages, 10));
    }

    /* TODO: Create a list of Complex Oomages called deadlyList
     * that shows the flaw in the hashCode function.
     */
<<<<<<< HEAD
    
=======
    /*
>>>>>>> ea721d79cb8f8c9d8fb51240be7a069e543ed26b
    @Test
    public void testWithDeadlyParams() {
        List<Oomage> deadlyList = new ArrayList<>();

        // Your code here.
<<<<<<< HEAD
        assertTrue(OomageTestUtility.haveNiceHashCodeSpread(deadlyList, 10));
    } 
=======

        assertTrue(OomageTestUtility.haveNiceHashCodeSpread(deadlyList, 10));
    } */
>>>>>>> ea721d79cb8f8c9d8fb51240be7a069e543ed26b

    /** Calls tests for SimpleOomage. */
    public static void main(String[] args) {
        jh61b.junit.textui.runClasses(TestComplexOomage.class);
    }
}
