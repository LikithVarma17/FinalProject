package com.udacity.gradle.builditbigger;


import android.content.Context;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.support.v4.util.Pair;
import android.test.AndroidTestCase;
import android.test.suitebuilder.annotation.LargeTest;

import junit.framework.Assert;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class AsyncTaskTest extends AndroidTestCase implements MyAsyncTask.JokeDisplay{
    MyAsyncTask.JokeDisplay jokeDisplay;
    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);
    @Test
    public void asyncTaskTest() throws InterruptedException, ExecutionException, TimeoutException {
        MyAsyncTask myAsyncTask=new MyAsyncTask(jokeDisplay);
        myAsyncTask.jokeDisplay=this;
        myAsyncTask.execute(new Pair<Context, String>(getContext(), "likith"));
        String joke = myAsyncTask.get(30, TimeUnit.SECONDS);
        Assert.assertNotNull(joke);
    }

    @Override
    public void response(String s) {

    }
}
