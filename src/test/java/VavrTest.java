import io.vavr.collection.List;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VavrTest {

    @Test
    public void test() {
        List<Integer> list = List.of( 1, 2, 3 );
        list.push( 4 );
        assertEquals( 3, list.size() );
    }
}
