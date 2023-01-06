import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;

import static org.junit.jupiter.api.Assertions.*;

class EngineTest {

    @Test
    public void testGenerateIMMM(){
        assertEquals(Engine.generateIMMM("#10",5),"01010");
    }

    @Test
    public void testGenerateRegistre(){
        assertEquals(Engine.generateRegistre("R0"),"000");
    }

    @Test
    public void testLSLS(){
        assertEquals(Engine.LSLS("lsls r0, r0, #10"),"0000001010000000");
    }

    @Test
    public void testADDS(){
        assertEquals(Engine.ADDS_Register("adds r1,r0,r2"),"0001100010000001");
    }

    @Test
    public void testADDS_3Bits(){
        assertEquals(Engine.ADDS_3bits("adds r1,r0,#4"),"0001110100000001");
    }

    @Test
    public void testMOVS(){
        assertEquals(Engine.MOVS("movs r6,#6"),"0010011000000110");
        assertNotEquals(Engine.MOVS("movs r6,#7"),"Hello world!");
    }

    @Test
    public void testANDS(){
        assertEquals(Engine.ANDS("ands r7,r3"),"0100000000011111");
    }

    @Test
    public void testSTR(){
        assertEquals(Engine.STR("str r1, [sp, #4]"),"1001000100000001");
    }

    @Test
    public void testLDR(){
        assertEquals(Engine.LDR("ldr r1, [sp, #4]"),"1001100100000001");
    }

    @Test
    public void testADD(){
        assertEquals(Engine.ADD("add sp,#32"),"1011000000001000");
    }

}