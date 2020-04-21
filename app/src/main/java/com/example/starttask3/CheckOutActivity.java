package com.example.starttask3;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CheckOutActivity extends AppCompatActivity {
    TextView First_name;
    TextView Second_name;
    TextView Third_name;
    TextView Fourth_name;
    TextView Fifth_name;
    TextView Sixth_name;


    TextView First_price;
    TextView Second_price;
    TextView Third_price;
    TextView Fourth_price;
    TextView Fifth_price;
    TextView Sixth_price;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_out);


        //Find view for grocery names
        First_name = findViewById(R.id.Groceryname1);
        Second_name = findViewById(R.id.Groceryname2);
        Third_name = findViewById(R.id.Groceryname3);
        Fourth_name = findViewById(R.id.Groceryname4);
        Fifth_name = findViewById(R.id.Groceryname5);
        Sixth_name = findViewById(R.id.Groceryname6);

        // Find view for the prices
        First_price = findViewById(R.id.Groceryprice1);
        Second_price = findViewById(R.id.Groceryprice2);
        Third_price = findViewById(R.id.Groceryprice3);
        Fourth_price = findViewById(R.id.Groceryprice4);
        Fifth_price = findViewById(R.id.Groceryprice5);
        Sixth_price = findViewById(R.id.Groceryprice6);

        // name getIntent
        Intent intent = getIntent();
        String string = intent.getStringExtra("Grocery_name1");
        String string2 = intent.getStringExtra("Grocery_name2");
        String string3 = intent.getStringExtra("Grocery_name3");
        String string4 = intent.getStringExtra("Grocery_name4");
        String string5 = intent.getStringExtra("Grocery_name5");
        String string6 = intent.getStringExtra("Grocery_name6");

        // Price getIntent
        Intent intentp = getIntent();
        String price1 = intentp.getStringExtra("Grocery_price1");
        String price2 = intentp.getStringExtra("Grocery_price2");
        String price3 = intentp.getStringExtra("Grocery_price3");
        String price4 = intentp.getStringExtra("Grocery_price4");
        String price5 = intentp.getStringExtra("Grocery_price5");
        String price6 = intentp.getStringExtra("Grocery_price6");

        First_name.setText(string);
        Second_name.setText(string2);
        Third_name.setText(string3);
        Fourth_name.setText(string4);
        Fifth_name.setText(string5);
        Sixth_name.setText(string6);

        First_price.setText(price1);
        Second_price.setText(price2);
        Third_price.setText(price3);
        Fourth_price.setText(price4);
        Fifth_price.setText(price5);
        Sixth_price.setText(price6);





    }


}
