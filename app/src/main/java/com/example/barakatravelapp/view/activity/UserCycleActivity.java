package com.example.barakatravelapp.view.activity;

import android.os.Bundle;
import android.widget.Toast;
import com.example.barakatravelapp.R;

import static com.example.barakatravelapp.utils.HelperMethod.replaceFragment;


public class UserCycleActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_cycle);
//        replaceFragment(getSupportFragmentManager(), R.id.user_activity_fram, new RegisterFragment());

//        Toast.makeText(this, "Broad cast reciever every 10 second", Toast.LENGTH_LONG)
//                .show();

    }

}
