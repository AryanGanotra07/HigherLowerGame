package com.ubtpro.higherandlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int n;
    public void makeToast(String string){
        Toast.makeText(MainActivity.this, string,Toast.LENGTH_SHORT).show();

    }
    public void clickFunction(View view){

        EditText eT=(EditText) findViewById(R.id.eT);

        int n1= Integer.parseInt(eT.getText().toString());
        if (n1==n){
            makeToast("you got it, try again");
            Random rand= new Random();

            n=rand.nextInt(20)+1;
        }
        else if(n1<n){
            makeToast("go higher");
        }
        else
        {
            makeToast("go lower");
        }


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random rand= new Random();

        n=rand.nextInt(20)+1;
    }
}
