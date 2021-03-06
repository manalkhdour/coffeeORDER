package com.example.android.myapplication;

        import android.os.Bundle;
        import android.support.v7.app.ActionBarActivity;
        import android.view.View;
        import android.widget.TextView;

        import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 **/
public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * This method is called when the order button is clicked.
     */
    int quantity=1;

    public void submitOrder(View view) {
        displayQuantity(quantity);
        displayPrice(5 * quantity);
    }
    public void increment(View view)
    {
        quantity=quantity+1;
        displayQuantity(quantity);
          }
    public void decrement(View view)
    {
         quantity=quantity-1;
        displayQuantity(quantity);
    }
    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayQuantity(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
}