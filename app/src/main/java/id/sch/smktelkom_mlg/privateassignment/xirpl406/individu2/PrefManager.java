package id.sch.smktelkom_mlg.privateassignment.xirpl406.individu2;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Windows XP on 16/05/2017.
 */

public class PrefManager {
    //Shared preferences file name
    private static final String PREF_NAME = "Mbok Jamu";
    private static final String IS_FIRST_TIME_LAUCH = "IsFirstTimeLaunch";
    SharedPreferences pref;
    SharedPreferences.Editor editor;
    Context _context;
    //shared pref mode
    int PRIVATE_MODE = 0;

    public PrefManager(Context context) {
        this._context = context;
        pref = _context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        editor = pref.edit();
    }

    public boolean isFirstTimeLaunch() {
        return pref.getBoolean(IS_FIRST_TIME_LAUCH, true);
    }

    public void setFirstTimeLaunch(boolean isFirstTime) {
        editor.putBoolean(IS_FIRST_TIME_LAUCH, isFirstTime);
        editor.commit();
    }


}
