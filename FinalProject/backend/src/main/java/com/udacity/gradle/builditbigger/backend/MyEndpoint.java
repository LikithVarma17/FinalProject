package com.udacity.gradle.builditbigger.backend;

import  com.example.javajoke.myClass;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

import javax.inject.Named;

/** An endpoint class we are exposing */
@Api(
        name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.builditbigger.gradle.udacity.com",
                ownerName = "backend.builditbigger.gradle.udacity.com",
                packagePath = ""
        )
)
public class MyEndpoint {
    String myJoke;

    /** A simple endpoint method that takes a name and says Hi back */
    @ApiMethod(name = "likith")
    public MyBean sayHi(@Named("name") String name) {
        MyBean response = new MyBean();
        myClass jk=new myClass();
        myJoke=jk.joke();
        response.setData(myJoke);
        return response;
    }

}
