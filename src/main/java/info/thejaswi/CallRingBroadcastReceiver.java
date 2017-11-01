package info.thejaswi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;

import java.lang.Runtime;
import java.io.IOException;

import android.util.Log;

public class CallRingBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        TelephonyManager tmgr = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);
        Integer callState = tmgr.getCallState();
        if (callState == TelephonyManager.CALL_STATE_OFFHOOK) {
            return ;
        }
        String number = intent.getStringExtra(TelephonyManager.EXTRA_INCOMING_NUMBER);
        Log.d("CallBlock", "Number is: " + number.toString());
        if (number != null && number.startsWith("+9114")) {
            Runtime rt = Runtime.getRuntime();
            try {
                rt.exec("service call phone 3");
            } catch (IOException ex) {
                Log.d("CallBlock", "IOException: " + ex.toString());
            }
        }
    }
}
