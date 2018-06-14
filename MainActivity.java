package com.example.ac1.myapplication3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private EditText Name;
    private EditText Aka;
    private EditText birth;
    private EditText email;
    private EditText about;
    private EditText lookin;
    private ImageView image;
    private Button Submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name = (EditText) findViewById(R.id.Name);
        Aka = (EditText) findViewById(R.id.Aka);
        birth = (EditText) findViewById(R.id.birth);
        email = (EditText) findViewById(R.id.email);
        about = (EditText) findViewById(R.id.about);
        lookin = (EditText) findViewById(R.id.lookin);
        image = (ImageView) findViewById(R.id.imageView);

        Submit = (Button) findViewById(R.id.submit);
        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //validate... boolean....ue o jucy validaye hen move.
                validate(birth);
            }
        });
    }

        private void validate(EditText birth) {

            String date=birth.substring(6,9);
            int y= Integer.parseInt(date.getText().toString());
            int ans;
            ans= 2018-y;
            if(ans>=18 ){
                Intent intent = new Intent (MainActivity.this, com.example.ac1.assignment21.secondA.class );
                startActivity(intent);
            }
            else {
                //one that says wrong


            }
        }

        public EditText getAge(){
            String date=this.birth.substring(6,9);
            int y= Integer.parseInt(date.getText().toString());
            int ans;
            ans= 2018-y;
            String anss= Integer.toString(ans);
            EditText ansss = (EditText) findViewById(R.id.whats);
            ansss.setText(anss);
            return ansss;
        }

        public String getImage(){
            return "girl.png";
        }

        public EditText getEmail(){
            return this.email;
        }

        public EditText getNick(){
            return this.Aka;
        }

        public EditText getAbout(){
            return this.about;
        }

        public EditText name(){
            return this.Name;
        }

        public EditText getLookin(){
            return this.lookin;
        }



}
