package com.example.medhini.register;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Main_Activity extends AppCompatActivity {

    DatabaseReference mDatabase;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_);

        mDatabase = FirebaseDatabase.getInstance().getReference();

        LoactionsTable loactionsTable= new LoactionsTable("2","2");

        pushLocation(loactionsTable);

    }

    private void pushLocation(LoactionsTable loactionsTable) {

        Log.d("TAG", "pushLocation: called");
        mDatabase.child("locations").child("uid").setValue(loactionsTable);


    }


}

