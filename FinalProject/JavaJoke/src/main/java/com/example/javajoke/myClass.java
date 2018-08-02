package com.example.javajoke;

import java.util.Random;

public class myClass {
    String[] myJoke={"My boss is so unpopular even his own shadow refuses to follow him.","Why do we park our car in the driveway and drive our car on the parkway? ","If tin whistles are made of tin, what are fog horns made of? ","Why do we park our car in the driveway and drive our car on the parkway? ","If big elephants have big trunks, do small elephants have suitcases? ","Q: What is orange and sounds like parrot? \n" +
            "A: A carrot\n","Q: What has many keys but can't open any doors? \n" +
            "A: A piano.","Q: What has 6 eyes but can't see? \n" +
            "A: 3 blind mice."};
    public String joke(){
        Random random=new Random();
        int i=random.nextInt(myJoke.length);
        return myJoke[i];
    }
}
