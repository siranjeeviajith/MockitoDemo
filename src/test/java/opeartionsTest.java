import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class opeartionsTest {
calculator cal = mock(calculator.class);
    @Test
    public void add() {
       /* opeartions op=new opeartions(cal); */
        when(cal.add(anyInt(),anyInt())).thenReturn(16);
       /* int res=op.add(1,4);
        assertEquals(21,res);
        verify(cal).add(12,4); */
       System.out.println(cal.add(2,5));
    }
}