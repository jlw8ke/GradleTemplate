package com.mobiquity.gradletemplate;

import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.SmallTest;

import com.robotium.solo.Solo;

public class MainActivityTestRobotium extends ActivityInstrumentationTestCase2<MainActivity> {

    private Solo solo;

    public MainActivityTestRobotium() {
        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        solo = new Solo(getInstrumentation(), getActivity());
    }

    @Override
    protected void tearDown() throws Exception {
        solo.finishOpenedActivities();
    }

    @SmallTest
    public void testMainActivityNotNull() {
        solo.assertCurrentActivity("wrong activity", MainActivity.class);
    }
}