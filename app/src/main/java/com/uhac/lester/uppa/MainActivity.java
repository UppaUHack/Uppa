package com.uhac.lester.uppa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import android.widget.ImageView;

import java.io.File;

public class MainActivity extends AppCompatActivity {
	private static int SPLASH_TIME_OUT = 2000;
    private Button mSendData;
    private DatabaseReference mRef;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run(){
                Intent homeIntent = new Intent(MainActivity.this, HomeActivity.class);
                startActivity(homeIntent);
                finish();
            }
        },SPLASH_TIME_OUT);
		FirebaseDatabase.getInstance().setPersistenceEnabled(true);
        mRef = FirebaseDatabase.getInstance().getReference();
        mSendData = (Button) findViewById(R.id.fire);
        mSendData.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                /*
                DatabaseReference mRootRef = mRef.child("Users").child("user234");
                mRootRef.child("Name").setValue("Joan");
                mRootRef.child("Age").setValue("18");
                mRootRef.child("Address").setValue("34 Freedom");
                mRootRef.child("Birthday").setValue("10-15-1999");
                mRootRef.child("Email").setValue("joanasuncion@gmail.com");
                mRootRef.child("Id").setValue("234");
                mRootRef.child("Password").setValue("pass");
                */
//                Users user = new Users();
//                user.addUser();

                Items item1 = new Items("spatula", "Maganda talaga siya", 23.3432, 4532.564, "500.00", 59.7);
                item1.addItem();
            }
        });
    }
    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();

    }
}
