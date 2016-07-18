package news.syj.com.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

import news.syj.com.fragment.HomeNewsFragment;

/**
 * Created by shayajie on 2016/7/18.
 */
public class Home_Fragment_ViewPagerAdapter extends FragmentPagerAdapter{

    private List<HomeNewsFragment> fragments;

    public void setFragments(List<HomeNewsFragment> fragments) {
        this.fragments = fragments;
    }

    public void addFragment(HomeNewsFragment fragment){


        fragments.add(fragment);
        notifyDataSetChanged();
    }



    public Home_Fragment_ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return null;
    }

    @Override
    public int getCount() {
        return 0;
    }
}
