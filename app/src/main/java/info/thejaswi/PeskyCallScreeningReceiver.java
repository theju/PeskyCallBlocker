package info.thejaswi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telecom.TelecomManager;
import android.telephony.TelephonyManager;

public class PeskyCallScreeningReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        String state = intent.getStringExtra(TelephonyManager.EXTRA_STATE);
        if (state.equals(TelephonyManager.EXTRA_STATE_RINGING)) {
            String number = intent.getStringExtra(TelephonyManager.EXTRA_INCOMING_NUMBER);
            if (number != null && number.startsWith("+9114")) {
                TelecomManager svc = (TelecomManager) context.getSystemService(Context.TELECOM_SERVICE);
                svc.endCall();
            }
        }
    }
}
