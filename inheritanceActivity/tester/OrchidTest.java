import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrchidTest {

    @Test
    void testingStuff(){
        //

        Orchid orchid1 = new Orchid ("Phalaenopsis orchid", "blue", 4, 20, "Moth Orchid");
//assertEquals()
        assertEquals("The orchid type Moth Orchid: ",orchid1.toString());
    }

}