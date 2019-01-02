package suraksha.in.suraksha;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import suraksha.in.helpers.SurakshaActivity;
import suraksha.in.helpers.ToastHelper;

public class AgentLoginActivity extends SurakshaActivity {

    private EditText agentId;
    private EditText agentPassword;
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_agent_login);
        agentId = (EditText) findViewById(R.id.agent_id_text);
        agentPassword = (EditText) findViewById(R.id.agent_password_text);
        loginButton = (Button) findViewById(R.id.btn_login);
    }

    public void onClickOfLogin(View v) {
        String agentIdInString = agentId.getText().toString();
        String agentPasswordInString = agentPassword.getText().toString();
        if (agentIdInString.isEmpty()) {
            makeToast(true, "User ID is Mandatory");
        } else if (agentPasswordInString.isEmpty()) {
            makeToast(true, "Password ID is Mandatory");
        } else {
            if (agentLogin(agentIdInString, agentPasswordInString)) {
                makeToast(false, "Login Successful");
                goToHomeActivity();
                
            } else {
                makeToast(true, "Login Failed");
            }
        }
    }

    private void goToHomeActivity() {
        Intent inent = new Intent(this, AgentHomeActivity.class);
        startActivity(inent);
    }

    private boolean agentLogin(String userName, String password) {
        return userName.equalsIgnoreCase(password);
    }

}
