 package com.example.ac1.assignment21;

import android.R;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ac1.myapplication3.MainActivity;

import org.w3c.dom.Text;

public class secondA extends AppCompatActivity {

    private EditText about;
    private EditText lookin;
    private EditText Demo;
    private EditText Contact;
    private ImageView image;
    private Button BS;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        Contact = (EditText) findViewById(R.id.TextView2);
        Demo = (EditText) findViewById(R.id.TextView3);
        about = (EditText) findViewById(R.id.TextView4);
        lookin = (EditText) findViewById(R.id.TextView5);
        image = (ImageView) findViewById(R.id.imageView);


        //call to main class
        MainActivity main = new MainActivity();
        EditText age, email, Aka, Name;
        //getting variable from main class/passing over variables
        age = main.getAge();
        email = main.getEmail();
        Aka = main.getNick();
        about = main.getAbout();
        lookin = main.getLookin();
        Name = main.name();
        Demo = setText(Name + " " + age + "/n AKA " + Aka);

        // setting buttons and validators
        BS = (Button) findViewById(R.id.Button);
        BS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                back();
            }

        });

    }

    public void back(){
        Intent intent = new Intent (secondA.this, MainActivity.class );
        startActivity(intent);
    }

}
