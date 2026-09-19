package com.nabd.phone;
import android.telecom.InCallService;
import android.telecom.Call;
public class NabdInCallService extends InCallService {
    private static Call activeCall;
    @Override public void onCallAdded(Call call) { activeCall = call; }
    @Override public void onCallRemoved(Call call) { if (activeCall == call) activeCall = null; }
    public static Call getActiveCall() { return activeCall; }
}
