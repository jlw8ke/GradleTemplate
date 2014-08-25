package com.mobiquity.gradletemplate;

import android.app.Activity;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

@Config(emulateSdk = 18)
@RunWith(RobolectricTestRunner.class)
public class MainActivityTest {
    @Before
    public void setup() {
        //do whatever is necessary before every test
    }

    @Test
    public void testActivityFound() {
        Activity activity = Robolectric.buildActivity(MainActivity.class).create().get();

        Assert.assertNotNull(activity);
    }
}