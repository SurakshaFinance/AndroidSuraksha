package suraksha.in.suraksha.customer;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import suraksha.in.suraksha.R;

public class ViewCustomerProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_customer_profile);
        setTitle("Customer Profile");
        this.getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#43C4F7")));

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
       if(item.getItemId() == android.R.id.home){
           finish();
           return true;
       }else{
           return false;
       }
    }

}
