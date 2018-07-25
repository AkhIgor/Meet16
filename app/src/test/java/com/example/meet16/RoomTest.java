package com.example.meet16;

import android.content.Context;

import org.junit.Before;
import org.junit.runner.RunWith;

/**
 * Created by Игорь on 25.07.2018.
 */

@RunWith(AndroidJUnit4.class)
public class RoomTest {

    private CalculatorDao calculatorDao;
    private MyDataBase myDataBase;

    @Before
    public void createDb()throws Exception {
        Context context = InstrumentationRegistry.getTargetContext();
    }
}
