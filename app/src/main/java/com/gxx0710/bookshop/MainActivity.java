package com.gxx0710.bookshop;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int quantityone = 1;
    int quantitytwo = 1;
    int quantitythree = 1;
    int quantityfour = 1;
    int quantityfive = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void wantToOrder(View view) {
        if (true) {
            Toast.makeText(this, "Slide to bottom to order books.", Toast.LENGTH_SHORT).show();
            return;
        }
    }










    public void incrementOne(View view) {
        if(quantityone==50){
            Toast.makeText(this,  "You can't have more than 50 books.", Toast.LENGTH_SHORT).show();
            return;
        }
        quantityone = quantityone + 1;
        displayQuantity(quantityone);
    }

    /**
     * This method is called when the - button is clicked.
     */
    public void decrementOne(View view) {
        if(quantityone==0){
            Toast.makeText(this,  "You can't order less than 0 book.", Toast.LENGTH_SHORT).show();
            return;
        }
        quantityone = quantityone - 1;
        displayQuantity(quantityone);

    }


    public void incrementTwo(View view) {
        if(quantitytwo==50){
            Toast.makeText(this,  "You can't have more than 50 books.", Toast.LENGTH_SHORT).show();
            return;
        }
        quantitytwo = quantitytwo + 1;
        displayQuantityTwo(quantitytwo);
    }

    /**
     * This method is called when the - button is clicked.
     */
    public void decrementTwo(View view) {
        if(quantitytwo==0){
            Toast.makeText(this,  "You can't order less than 0 book.", Toast.LENGTH_SHORT).show();
            return;
        }
        quantitytwo = quantitytwo - 1;
        displayQuantityTwo(quantitytwo);

    }


    public void incrementThree(View view) {
        if(quantitythree==50){
            Toast.makeText(this,  "You can't have more than 50 books.", Toast.LENGTH_SHORT).show();
            return;
        }
        quantitythree = quantitythree + 1;
        displayQuantityThree(quantitythree);
    }

    /**
     * This method is called when the - button is clicked.
     */
    public void decrementThree(View view) {
        if(quantitythree==0){
            Toast.makeText(this,  "You can't order less than 0 book.", Toast.LENGTH_SHORT).show();
            return;
        }
        quantitythree = quantitythree - 1;
        displayQuantityThree(quantitythree);

    }
    public void incrementFour(View view) {
        if(quantityfour==50){
            Toast.makeText(this,  "You can't have more than 50 books.", Toast.LENGTH_SHORT).show();
            return;
        }
        quantityfour = quantityfour + 1;
        displayQuantityFour(quantityfour);
    }

    /**
     * This method is called when the - button is clicked.
     */
    public void decrementFour(View view) {
        if(quantityfour==0){
            Toast.makeText(this,  "You can't order less than 0 book.", Toast.LENGTH_SHORT).show();
            return;
        }
        quantityfour = quantityfour - 1;
        displayQuantityFour(quantityfour);

    }
    public void incrementFive(View view) {
        if(quantityfive==50){
            Toast.makeText(this,  "You can't have more than 50 books.", Toast.LENGTH_SHORT).show();
            return;
        }
        quantityfive = quantityfive + 1;
        displayQuantityFive(quantityfive);
    }

    /**
     * This method is called when the - button is clicked.
     */
    public void decrementFive(View view) {
        if(quantityfive==0){
            Toast.makeText(this,  "You can't order less than 0 book.", Toast.LENGTH_SHORT).show();
            return;
        }
        quantityfive = quantityfive - 1;
        displayQuantityFive(quantityfive);

    }


    private void displayQuantity(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantityone_text_view);
        quantityTextView.setText("" + number);
    }

    private void displayQuantityThree(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantitythree_text_view);
        quantityTextView.setText("" + number);
    }
    private void displayQuantityFour(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantityfour_text_view);
        quantityTextView.setText("" + number);
    }
    private void displayQuantityTwo(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantitytwo_text_view);
        quantityTextView.setText("" + number);
    }
    private void displayQuantityFive(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantityfive_text_view);
        quantityTextView.setText("" + number);
    }


    public void submitOrder(View view) {
        int price = quantityone * 10 + quantitytwo * 11 + quantitythree * 12 + quantityfour * 13 + quantityfive * 14;
        String priceMassage = "$" + price;

        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mail to:"));
        intent.putExtra(Intent.EXTRA_SUBJECT, "Book order");
        intent.putExtra(Intent.EXTRA_TEXT, priceMassage);
        if(intent.resolveActivity(getPackageManager())!= null){
            startActivity(intent);
        }

        displayMessage(priceMassage);
    }

    private void displayMessage(String message) {
        TextView quantityTextView = (TextView) findViewById(R.id.order_summary_text_view);
        quantityTextView.setText(message);
    }

}
