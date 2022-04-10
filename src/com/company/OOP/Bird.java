package com.company.OOP;

public class Bird extends Animals {
    private String color;
    private boolean fly = true;
    private String songSound;

  public Bird (String type, int numberOfLegs, String color) {
      super (type, numberOfLegs);
        this.color = color;
    }

    public void doesItFly () {
        if (fly) {
            System.out.println("It flies!");
        } else {
            System.out.println("It doesn't fly.");
        }
    }


    public String getSongSound() {
        return songSound;
    }

    public void setSongSound(String songSound) {
        this.songSound = songSound;
    }

    public String howItSings (String sounds) {
        if (sounds == "sings") {

            System.out.println(songSound);
        }
            return "It doesn't sing.";


    }


}
