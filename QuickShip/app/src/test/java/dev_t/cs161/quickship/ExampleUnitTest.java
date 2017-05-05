package dev_t.cs161.quickship;


import org.junit.Test;


import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    /*@Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }*/
    @Test
    public void quickShipBluetoothPacketsToBeSent_testSetAndGetPacketType() throws Exception {
        quickShipBluetoothPacketsToBeSent dataPacket = new quickShipBluetoothPacketsToBeSent(quickShipBluetoothPacketsToBeSent.TURN_DONE, true);
        assertEquals(quickShipBluetoothPacketsToBeSent.TURN_DONE, dataPacket.getPacketType());
    }
    @Test
    public void quickShipBluetoothPacketsToBeSent_testSetAndGetChatMessage() throws Exception {
        String full_msg = "full message...";
        quickShipBluetoothPacketsToBeSent dataPacket = new quickShipBluetoothPacketsToBeSent(quickShipBluetoothPacketsToBeSent.CHAT, full_msg);
        assertTrue("Successfully set and retrieved chat message", full_msg.equals(dataPacket.getChatMessage()));
    }
}