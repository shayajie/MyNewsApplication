package news.syj.com;

import android.app.Application;

import com.umeng.analytics.MobclickAgent;

import news.syj.com.utils.MyLog;
import news.syj.com.utils.UmengManager;

/**
 * Created by shayajie on 2016/7/11.
 */
public class NewsApplication extends Application{
    @Override
    public void onCreate() {
        super.onCreate();

        MyLog.setEnabled(true);

        UmengManager.setEnabled(true,true,true);
    }
}
