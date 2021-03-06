package suraksha.in.suraksha;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class FailedActivity extends AppCompatActivity {

    TextView displayMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_failed);

        String title = savedInstanceState != null? (String)savedInstanceState.get("title") : "";
        setTitle(title != null && title.length() != 0 ? title : "Request Failed");
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
