package news.syj.com.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by shayajie on 2016/7/4.
 */
public class BaseActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void startActivity(Intent intent) {
        super.startActivity(intent);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
