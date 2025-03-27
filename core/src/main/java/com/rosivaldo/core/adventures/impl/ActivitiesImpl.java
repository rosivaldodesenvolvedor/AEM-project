package com.rosivaldo.core.adventures.impl;

import java.util.Random;

import com.rosivaldo.core.adventures.Activities;
import org.osgi.service.component.annotations.Component;


@Component
public class ActivitiesImpl implements Activities {


     private static final String[] ACTIVITIES = new String[]{
         "campig", "skiing", "skateboarding"
     };

    private final Random random = new Random();

     public String getRandomActivity(){
         int randomIndex = random.nextInt(ACTIVITIES.length);
        return ACTIVITIES[randomIndex];
     };

}