package com.hfad.workout;

public class Workout {
    private String name;
    private String description;

    public static final Workout[] workouts = {
            new Workout("The limb looser","5 Handstand push-ups\n10 1-legged squats\n100 squats"),
            new Workout("Core agony","100 Pull-ups\n100 push-ups\n100 sit-ups\n 100 Squats"),
            new Workout("The Wimp specialist","5 Pull-ups\n10 Push-ups\n15 Squats"),
            new Workout("Strenght and Lenght","500 meter run\n1x1,5 pood kettleball\n21 x pull-ups")
    };

    public Workout(String name, String description){
        this.name= name;
        this.description = description;
    }
    public String getName(){
        return name;
    }

    public String getDescription() {
        return description;
    }
    public String toString(){
        return this.name;
    }
}
