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
	String number = intent.getStringExtra(TelephonyManager.EXTRA_INCOMING_NUMBER);
	if (number != null && number.startsWith("+9114")) {
	    Runtime rt = Runtime.getRuntime();
	    try {
		Runtime.getRuntime().exec("service call phone 5");
	    } catch (IOException ex) {
		Log.d("CallBlock", "IOException: " + ex.toString());
	    }
	}
    }
}
