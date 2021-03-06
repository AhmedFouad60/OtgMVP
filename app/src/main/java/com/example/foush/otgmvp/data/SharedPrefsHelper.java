package com.example.foush.otgmvp.data;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by foush on 09/02/18.
 */

public class SharedPrefsHelper {

    //name the sharedPreference
    public static final String MY_PREFS="MY_APP";
    public static final String MY_EMAIL="EMAIL";
    public static final String MY_TOKEN="TOKEN";
    public static final String MY_PASSWORD="PASSWORD";
    public static final String MY_FIREBASE_TOKEN="FIREBASE_TOKEN";
    public static final String MY_QR="MY_QR_PATH";
    public static final String MY_ORDER_ID="MY_ORDERID";





    SharedPreferences msharedPreferences;

    public SharedPrefsHelper(Context context){
        msharedPreferences=context.getSharedPreferences(MY_PREFS,Context.MODE_PRIVATE);

    }
    public void clear(){
        msharedPreferences.edit().clear().apply();
    }
    public void putEmail(String email){
        msharedPreferences.edit().putString(MY_EMAIL,email).apply();
    }
    public String getEmail(){
        return msharedPreferences.getString(MY_EMAIL,null);
    }
    public void setLoggedInMode(Boolean loggedInMode){
        msharedPreferences.edit().putBoolean("IS_LOGGED_IN",loggedInMode).apply();
    }
    public Boolean getLoggedInMode(){
        return msharedPreferences.getBoolean("IS_LOGGED_IN",false);
    }
    public void putToken(String token){
        msharedPreferences.edit().putString(MY_TOKEN,token).apply();
    }
    public String getToken(){
        return msharedPreferences.getString(MY_TOKEN,null);
    }

    public void putPassword(String password){
        msharedPreferences.edit().putString(MY_PASSWORD,password).apply();
    }
    public String getPassword(){
        return msharedPreferences.getString(MY_PASSWORD,null);
    }

    /**FireBase Token*/

    public void putFireBaseToken(String token){
        msharedPreferences.edit().putString(MY_FIREBASE_TOKEN,token).apply();
    }
    public String getFireBaseToken(){
        return msharedPreferences.getString(MY_FIREBASE_TOKEN,null);
    }


    public void putQR(String path){
        msharedPreferences.edit().putString(MY_QR,path).apply();
    }
    public String getQR(){
        return msharedPreferences.getString(MY_QR,null);
    }

    public void putOrderID(int orderID){
        msharedPreferences.edit().putInt(MY_ORDER_ID,orderID).apply();
    }
    public int getOrderID(){
        return msharedPreferences.getInt(MY_ORDER_ID,0);
    }













}
