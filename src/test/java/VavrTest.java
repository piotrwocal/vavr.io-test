import io.vavr.collection.List;
import io.vavr.collection.SortedSet;
import io.vavr.collection.TreeSet;
import org.junit.Test;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class VavrTest {

    /**
     * Directly from vavr.io page - Vavr (formerly called Javaslang) is a functional library for Java 8+
     * that provides persistent data types and functional control structures.
     *
     * - think about it as about Guava for Java8 with stronger functional flavour
     * - values/immutable objects
     * - reduction of side effects
     * - referential transparency
     */

//    http://www.vavr.io/
//    https://github.com/vavr-io/vavr
//    https://www.baeldung.com/vavr-java-streams
//    https://www.baeldung.com/vavr-collections
//    https://touk.pl/blog/2017/08/23/vavr-collections-and-java-stream-api-collectors/


    @Test
    public void testList() {
        List<Integer> initList = List.of( 1, 2, 3 );
        List<Integer> updatedList = initList.push( 4 );
        assertEquals( 3, initList.size() );
        assertEquals( 4, updatedList.size() );

        SortedSet<Integer> set = TreeSet.of( 1, 2, 2, 3 );
        set.add( 7 );
        assertEquals( 3, set.size() );
    }
}
