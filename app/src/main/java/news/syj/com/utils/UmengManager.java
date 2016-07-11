package news.syj.com.utils;

import android.content.Context;

import com.umeng.analytics.MobclickAgent;

/**
 * Created by shayajie on 2016/7/11.
 */
public class UmengManager {

    private static boolean sEnabled = false;

    /**
     * 友盟
     * @param enabled 是否使用友盟统计
     * @param debugenabled debug输出
     * @param includefragment 应用是否有Fragment
     */
    public static void setEnabled(boolean enabled,boolean debugenabled,boolean includefragment) {
        sEnabled = enabled;
        if(enabled){
            setUmengDebug(debugenabled);
            setIsIncludeFragment(includefragment);
        }

    }

    public static void setUmengDebug(boolean enabled){
        MobclickAgent.setDebugMode(enabled);
    }

    public static void setIsIncludeFragment(boolean enabled){
        MobclickAgent.openActivityDurationTrack(!enabled);
    }

    public static void onPageStart(String TAG){
        if(sEnabled){
            MobclickAgent.onPageStart(TAG);
        }

    }

    public static void onPageEnd(String TAG){
        if(sEnabled){
            MobclickAgent.onPageEnd(TAG);
        }

    }

    public static void onResume(Context context){
        if(sEnabled){
            MobclickAgent.onResume(context);
        }

    }

    public static void onPause(Context context){
        if(sEnabled){
            MobclickAgent.onPause(context);
        }

    }



}
