package news.syj.com.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import news.syj.com.R;
import news.syj.com.utils.UmengManager;

/**
 * Created by shayajie on 2016/7/15.
 */
public abstract class BaseFragment extends Fragment{
    private final String TAG = this.getClass().getSimpleName();
    protected TextView tv_fragment_title;
    protected ImageView img_fragment_title_icon;
    protected ImageView img_fragment_title_notice;
    protected RelativeLayout rel_fragment_title_notice;

    protected abstract int getLayoutId();
    protected abstract int getTitleId();
    protected abstract int getImgResID();
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(getLayoutId(),container,false);
        ininttile(view);
        return view;
    }

    protected void ininttile(View mainView){
        tv_fragment_title = (TextView) mainView.findViewById(R.id.tv_fragment_title);
        tv_fragment_title.setText(getString(getTitleId()));

        img_fragment_title_icon = (ImageView)mainView.findViewById(R.id.img_fragment_title_icon);
        img_fragment_title_icon.setImageResource(getImgResID());

        img_fragment_title_notice = (ImageView)mainView.findViewById(R.id.img_fragment_title_notice);

        rel_fragment_title_notice = (RelativeLayout) mainView.findViewById(R.id.rel_fragment_title_notice);

    }

    @Override
    public void onPause() {
        super.onPause();
        UmengManager.onPageEnd(TAG);

    }

    @Override
    public void onResume() {
        super.onResume();
        UmengManager.onPageStart(TAG);
    }
}
