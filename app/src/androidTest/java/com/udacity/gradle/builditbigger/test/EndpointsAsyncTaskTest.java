package com.udacity.gradle.builditbigger.test;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;


import com.udacity.gradle.builditbigger.EndpointsAsyncTask;
import com.udacity.gradle.builditbigger.MainActivity;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.CountDownLatch;


import static junit.framework.Assert.assertTrue;


@RunWith(AndroidJUnit4.class)
public class EndpointsAsyncTaskTest {
    private Context mContext;

    @Before
    public void setup() {
        mContext = InstrumentationRegistry.getContext();
    }
    @Test
    public void testVerifyEndpointResponse() {
       new TestEndpointsAsyncTask(mContext).execute();
    }


    class TestEndpointsAsyncTask extends EndpointsAsyncTask{


        public TestEndpointsAsyncTask(Context context) {
            super(context);
        }

        @Override
        protected void onPreExecute() {

        }

        @Override
        protected String doInBackground(Void... voids) {
            return super.doInBackground();
        }

        @Override
        protected void onPostExecute(String result) {
            assertTrue(!result.isEmpty());
        }
    }
}


