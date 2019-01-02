package suraksha.in.helpers;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup;

import java.util.HashMap;
import java.util.Map;

import suraksha.in.suraksha.R;

public class SurakshaActivity extends Activity {

    protected Map<String, Object> contextMap = new HashMap<>();

    public Map<String, Object> getContextMap() {
        return contextMap;
    }

    public void setContextMap(Map<String, Object> contextMap) {
        this.contextMap = contextMap;
    }

    public void makeToast(boolean isError, String displayMessage) {
        ToastHelper.makeToast((ViewGroup) findViewById(R.id.llCustom), getLayoutInflater(), getApplicationContext(), isError, displayMessage);
    }
}
