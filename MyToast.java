package mytoast.htetaunglin.com.mycustomertoast;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

/*
 * Created by Htet Aung Lin on 16/06/2018.
 */

public class MyToast extends Toast {
    /**
     * Construct an empty Toast object.  You must call {@link #setView} before you
     * can call {@link #show}.
     *
     * @param context The context to use.  Usually your {@link Application}
     *                or {@link Activity} object.
     */

    public MyToast(Context context) {
        super(context);
    }


    public static Toast makeText(Context context, CharSequence message, int duration) {
        Toast toast = new Toast(context);

        LinearLayout layout = new LinearLayout(context);
        layout.setOrientation(LinearLayout.HORIZONTAL);
        layout.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));

        TextView toastMessage = new TextView(context);
        toastMessage.setText(message);
        toastMessage.setTextSize(16);
        toastMessage.setTextColor(Color.WHITE);
        toastMessage.setGravity(Gravity.CENTER);
        toastMessage.setPadding(5, 5, 5, 5);

        LinearLayout.LayoutParams lparams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        toastMessage.setLayoutParams(lparams);

        layout.addView(toastMessage);
        layout.setBackgroundColor(Color.parseColor("#000000"));

        toast.setView(layout);
        toast.setDuration(duration);
        return toast;
    }
}
