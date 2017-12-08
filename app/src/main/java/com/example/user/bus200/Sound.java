package com.example.user.bus200;

import android.content.Context;
import android.media.MediaPlayer;
import android.util.Log;

import java.util.InputMismatchException;

import static com.example.user.bus200.MainActivity.StopID;
import static com.example.user.bus200.MainActivity.bus_number1;
import static com.example.user.bus200.MainActivity.bus_number2;
import static com.example.user.bus200.MainActivity.bus_number3;


public class Sound{

    Context context;
    public Sound(Context context){
        this.context=context;
    }
    public void alarm(){
        try {
            if (bus_number1.equals(StopID) || bus_number2.equals(StopID) || bus_number3.equals(StopID)) {
                Log.d("mk", "timer");
                // Toast.makeText(getApplicationContext(), "랄라", Toast.LENGTH_LONG).show();
                MediaPlayer mPlayer = MediaPlayer.create(context, R.raw.www);
                mPlayer.start();
            }
        }catch(InputMismatchException e){
            Log.d("mk","try catch");
        }
    }
}