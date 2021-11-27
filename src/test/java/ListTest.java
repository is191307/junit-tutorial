import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.util.Arrays;
import java.util.List;

public class ListTest {

    @Test
    @DisplayName("Trying hamcrest")
    void hasOnlyThreeElements(){
        List<Integer> myList = Arrays.asList(5,2,4);

        assertThat(myList, hasSize(3));
        assertThat(myList, containsInAnyOrder(2,4,5));
        assertThat(myList, everyItem(greaterThan(1)));
    }

}
