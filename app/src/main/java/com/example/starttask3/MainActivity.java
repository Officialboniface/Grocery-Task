package com.example.starttask3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button Checkout_btn;
    //EditText that holds the Grocery name
    EditText FirstEditTv;
    EditText SecondEditTv;
    EditText ThirdEditTv;
    EditText FourthEditTv;
    EditText FifthEditTv;
    EditText SixthEditTv;
    // EditText that holds the Grocery prices
    EditText FirstPriceEditTv;
    EditText SecondPriceEditTv;
    EditText ThirdPriceEditTv;
    EditText FourthPriceEditTv;
    EditText FifthPriceEditTv;
    EditText SixthPriceEditTv;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Checkout_btn = findViewById(R.id.Checkout_Button);

        //find views for grocery price tv
        FirstEditTv = findViewById(R.id.Grocery_name1);
        SecondEditTv = findViewById(R.id.Grocery_name2);
        ThirdEditTv = findViewById(R.id.Grocery_name3);
        FourthEditTv = findViewById(R.id.Grocery_name4);
        FifthEditTv = findViewById(R.id.Grocery_name5);
        SixthEditTv = findViewById(R.id.Grocery_name6);
// find views for price tv
        FirstPriceEditTv = findViewById(R.id.Grocery_price1);
        SecondPriceEditTv = findViewById(R.id.Grocery_price2);
        ThirdPriceEditTv = findViewById(R.id.Grocery_price3);
        FourthPriceEditTv = findViewById(R.id.Grocery_price4);
        FifthPriceEditTv = findViewById(R.id.Grocery_price5);
        SixthPriceEditTv = findViewById(R.id.Grocery_price6);

        Checkout_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), CheckOutActivity.class);

                // Data passing for grocery names
                String namestr1 = FirstEditTv.getText().toString();
                intent.putExtra("Grocery_name1", namestr1);
                String namestr2 = SecondEditTv.getText().toString();
                intent.putExtra("Grocery_name2", namestr2);
                String namestr3 = ThirdEditTv.getText().toString();
                intent.putExtra("Grocery_name3", namestr3);
                String namestr4 = FourthEditTv.getText().toString();
                intent.putExtra("Grocery_name4", namestr4);
                String namestr5 = FifthEditTv.getText().toString();
                intent.putExtra("Grocery_name5", namestr5);
                String namestr6 = SixthEditTv.getText().toString();
                intent.putExtra("Grocery_name6", namestr6);








                // Data passing for price
                String pricestr1 = FirstPriceEditTv.getText().toString();
                String pricestr2 = SecondPriceEditTv.getText().toString();
                String pricestr3 = ThirdPriceEditTv.getText().toString();
                String pricestr4 = FourthPriceEditTv.getText().toString();
                String pricestr5 = FifthPriceEditTv.getText().toString();
                String pricestr6 = SixthPriceEditTv.getText().toString();


                intent.putExtra("Grocery_price1", pricestr1);
                intent.putExtra("Grocery_price2", pricestr2);
                intent.putExtra("Grocery_price3", pricestr3);
                intent.putExtra("Grocery_price4", pricestr4);
                intent.putExtra("Grocery_price5", pricestr5);
                intent.putExtra("Grocery_price6", pricestr6);





                startActivity(intent);
            }
        });


    }


}
