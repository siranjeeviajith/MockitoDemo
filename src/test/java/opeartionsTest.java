import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.powermock.api.extension.listener.AnnotationEnabler;
import org.powermock.core.classloader.annotations.PowerMockListener;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.powermock.api.mockito.PowerMockito.when;
import static org.powermock.api.mockito.PowerMockito.whenNew;

@RunWith(PowerMockRunner.class)
@PrepareForTest({opeartions.class})
public class opeartionsTest {
    @Mock
    private calculator cal;
    @Test
    public void add() throws Exception {
        whenNew(calculator.class).withAnyArguments().thenReturn(cal);
        opeartions op=new opeartions();
        when(cal.add(anyInt(),anyInt())).thenReturn(16);
        System.out.println(op.add(2,5));

        assertEquals(20, op.add(1,4));

    }
}