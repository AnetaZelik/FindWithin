import findWithin.FindArray;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindArrayTest {

    private FindArray findArray;

    @Before
    public void testSetup() throws Exception {
        findArray = new FindArray();
    }

    @Test
    public void findArrayFromTaskDescription() throws Exception {
        //given
        final int[] array = {4, 9, 3, 7, 8};
        final int[] subArray = {3, 7};

        //when
        int result = findArray.findArray(array, subArray);
        int result2 = findArray.findArray(new int[]{4, 9, 3, 7, 8,5, 6,3,7,5,9 }, new int[]{3, 7, 5});

        //then
        assertEquals(2, result);
        assertEquals(7, result2);
    }
}