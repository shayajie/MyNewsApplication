package news.syj.com.utils;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;

import news.syj.com.R;

/**
 * Created by shayajie on 2016/7/18.
 */
public class StatusBarCompat {

    private static final int INVALID_VAL = -1;
    private static final int COLOR_DEFAULT = R.color.my_statusbar_color;

    public static void compat(Activity activity)
    {
        compat(activity, INVALID_VAL);
    }

    public static void compat(Activity activity,int statusColor){
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){

            if(statusColor != INVALID_VAL){
                activity.getWindow().setStatusBarColor(statusColor);
            }
            return;
        }
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT && Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP){
            int color = COLOR_DEFAULT;
            ViewGroup contentView = (ViewGroup) activity.findViewById(android.R.id.content);
            if(statusColor != INVALID_VAL){
                color = statusColor;
            }
            View statusBarView = new View(activity);
            ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                    getStatusBarHeight(activity));
            statusBarView.setBackgroundColor(color);
            contentView.addView(statusBarView, lp);
        }
    }

    private static int getStatusBarHeight(Context context) {

        int result = 0;
        int resourceId = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (resourceId > 0)
        {
            result = context.getResources().getDimensionPixelSize(resourceId);
        }
        return result;
    }


}
