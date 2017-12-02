package com.uhac.lester.uppa;

import android.app.Application;
import android.support.annotation.NonNull;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseException;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/**
 * Created by Lester on 12/1/2017.
 */

public class Users extends Application{

    private DatabaseReference mRef;
    private Button mLoginButton;
    private String phoneNumber = "09953203700";
    private PhoneAuthProvider.OnVerificationStateChangedCallbacks mCallbacks;
    private FirebaseAuth mAuth; 
    private String userId, name, birthDate, gender, contact, email, pass, userType, address;



    public Users(String uAddress, String uBday, String uContact, String uEmail, String uGender, String uId, String uName, String uPass, String uType){
        address = uAddress;
        birthDate =uBday;
        contact = uContact;
        email = uEmail;
        gender = uGender;
        userId = uId;
        name = uName;
        pass = uPass;
        userType = uType;
    }
    public void addUser(){

        mRef = FirebaseDatabase.getInstance().getReference();
        Random r = new Random();
        int id = r.nextInt();

        Log.d("Id", Integer.toString(id));

//        DatabaseReference mRootRef = mRef.child("Users").child("user" + Integer.toString(id));
//        mRootRef.child("Name").setValue("Joan");
//        mRootRef.child("Age").setValue("18");
//        mRootRef.child("Address").setValue("34 Freedom");
//        mRootRef.child("Birthday").setValue("10-15-1999");
//        mRootRef.child("Email").setValue("joanasuncion@gmail.com");
//        mRootRef.child("Id").setValue(Integer.toString(id));
//        mRootRef.child("Password").setValue("pass");

    }

    public void register(String name, String birthday, String address, String gender, String contact, String email, String password, int userType) {

        mAuth = FirebaseAuth.getInstance();


    }

    public void login(String mobileNumber, String password){

    }

    public String getEmail(){
        return email;
    }



}
   