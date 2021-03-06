/*
   For step-by-step instructions on connecting your Android application to this backend module,
   see "App Engine Java Endpoints Module" template documentation at
   https://github.com/GoogleCloudPlatform/gradle-appengine-templates/tree/master/HelloEndpoints
*/

package com.nanodegree.p4.jokeGCMBackend;

import com.example.JokeProvider;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

import javax.inject.Named;

/**
 * An endpoint class we are exposing
 */
@Api(
        name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "jokeGCMBackend.p4.nanodegree.com",
                ownerName = "jokeGCMBackend.p4.nanodegree.com",
                packagePath = ""
        )
)
public class MyEndpoint {


    @ApiMethod(name = "getJokes")
    public MyBean getJokes() {
        MyBean response = new MyBean();
        JokeProvider jokeProvider = new JokeProvider();
        response.setData(jokeProvider.getJoke());

        return response;
    }

}
