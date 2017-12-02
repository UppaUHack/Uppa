package com.uhac.lester.uppa;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class HomeActivity extends AppCompatActivity {

    DatabaseReference mRef;
    DatabaseReference mLoginReference;
    private Button login;
    EditText email;
    private EditText pass;
    String emailVal;
    private String passVal;
    private DatabaseReference usersRef;
    private DatabaseReference user1Ref;
    private DatabaseReference passRef;
	private TextView txtAccount;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        
		txtAccount = (TextView) (findViewById(R.id.txtAccount));
        txtAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, Register.class);
                startActivity(intent);
            }
        });
		
		email = (EditText) (findViewById(R.id.inputEmail));
        pass = (EditText) (findViewById(R.id.inputPass));

        login = (Button) (findViewById(R.id.btnLogin));

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                emailVal = email.getText().toString();
                passVal = pass.getText().toString();
                Log.d("Email", emailVal);

                mRef = FirebaseDatabase.getInstance().getReference();

                mRef.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {

                        if(dataSnapshot.child("Users").child(emailVal).exists()){
                            usersRef = FirebaseDatabase.getInstance().getReference("Users");
                            user1Ref = usersRef.child(emailVal);
                            passRef = user1Ref.child("uPass");

                            user1Ref.addValueEventListener(new ValueEventListener() {
                                @Override
                                public void onDataChange(DataSnapshot dataSnapshot) {

                                    //Log.i("pass", dataSnapshot.child("uPass").getValue(String.class));
                                    String passFire = dataSnapshot.child("uPass").getValue(String.class);
                                    Log.i("PassFire", passFire);
                                    Log.i("PassVal", passVal);
                                    if(passVal.equals(passFire)){
                                        Log.d("status" , "Login");
                                    }
                                    else{
                                        Log.d("status", "Not Logged In");
                                    }
                                }

                                @Override
                                public void onCancelled(DatabaseError databaseError) {
                                    //Log.w("Error", "onCancelled", databaseError.toException());
                                }
                            });

                        }
                        else{
                            Log.d("Log", "Fail");
                        }
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });
            }
        });
    }



}
