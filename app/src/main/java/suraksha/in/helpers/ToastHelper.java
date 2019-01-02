package suraksha.in.helpers;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import suraksha.in.suraksha.R;

public class ToastHelper {
    public static void makeToast(ViewGroup viewGroup, LayoutInflater inflater, Context applicationContext, boolean isError, String displayMessage) {
        View toastLayout = inflater.inflate(R.layout.suraksha_toast, viewGroup);
        Toast toast = new Toast(applicationContext);
        int color = isError ? Color.parseColor("#ff0100") : Color.parseColor("#77ab59");
        toast.setView(toastLayout);
        TextView text = (TextView) toastLayout.findViewById(R.id.suraksha_toast_text);
        text.setText(displayMessage);
        text.setBackgroundColor(color);
        toast.show();
    }
}
