import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class mainTest {
    @Test
    public void plus() {
        int a = 1;
        int b = 2;
        assertThat(a+b).isEqualTo(3);
    }

    @Test
    public void minus() {
        int a = 2;
        int b = 1;
        assertThat(a-b).isEqualTo(1);
    }

    @Test
    public void mok() {
        int a = 5;
        int b = 3;
        assertThat(a/b).isEqualTo(10);
    }
}
