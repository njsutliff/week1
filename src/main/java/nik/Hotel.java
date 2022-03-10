package nik;

import nik.ui.View;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Hotel {
    int max_cap = 100;
        String[] capsules = new String[max_cap];
      public  Hotel(){
          Arrays.fill(capsules, "empty");
      }

    public void checkIn(int capsule, String person) {
                capsules[capsule] = person;

                if(capsules[capsule]==null){
                    System.out.println("Failed to add");
                }
                else{
                    System.out.println("Success.");
                }

    }

    public void checkOut(int capsule, String person) {
          if (!Objects.equals(capsules[capsule], person)){
              System.out.println("Did not find person to checkout. ");
          }
       for (int i = 0; i < max_cap; i++){
           if (capsules[i].equals(person)){
               capsules[i] = "empty";
               System.out.println("Checked out" + person);
           }
       }
    }

    public void viewGuests(int capsule) {
          if( capsule<10){
              for (int i =0; i < capsule+10; i++){
                  System.out.println(i + " " + capsules[i]);
              }
              if (capsule>max_cap-10){
                  for (int i =max_cap-10; i < max_cap; i++){
                      System.out.println(i + " " + capsules[i]);
                  }
              }
          }
          else {
              for (int i = capsule-10; i < capsule+10; i++) {
                  System.out.println(i + " " + capsules[i]);
              }
          }
    }
}
