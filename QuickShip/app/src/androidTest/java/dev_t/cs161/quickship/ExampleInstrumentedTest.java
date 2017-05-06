package dev_t.cs161.quickship;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.test.InstrumentationRegistry;
import android.support.test.espresso.core.deps.guava.util.concurrent.ExecutionError;
import android.support.test.runner.AndroidJUnit4;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.Button;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest extends ActivityInstrumentationTestCase2<quickShipActivityMain>{
    public ExampleInstrumentedTest(){
        super(quickShipActivityMain.class);

    }
    /*@Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("dev_t.cs161.quickship", appContext.getPackageName());
    }*/

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        injectInstrumentation(InstrumentationRegistry.getInstrumentation());

    }

    @Test
    public void test() throws Exception{
        //Possible fix
        //http://stackoverflow.com/questions/27991363/activityunittestcase-throws-runtimeexception-when-ran-with-androidjunitrunner

        //quickShipActivityMain mActivity = getActivity();

        int endcode;

        Button mBluetoothEnableButtonTest = (Button) getActivity().findViewById(R.id.splash_creen_bluetooth_btn);
        endcode = getActivity().getEndCode();
        assertEquals(0,getActivity().getEndCode());
        getActivity().finish();
        assertEquals(1,getActivity().getEndCode());
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
}
