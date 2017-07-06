package com.example.alessio.project6;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {

    /*Field*/
    private Context mContext;

    /*Constructor Method*/
    public CategoryAdapter (Context context, FragmentManager fm){
        super (fm);
        mContext = context;
    }

    /*Helper Method*/
    @Override
    public Fragment getItem(int position){
        if (position == 0) {
            return new EatFragment();
        } else if (position == 1) {
            return new DrinkFragment();
        } else if (position == 2) {
            return new HaveFunFragment();
        } else {
            return new LearnFragment();
        }
    }

    /*Helper Method*/
    @Override
    public int getCount() {
        return 4;
    }

    /*Helper Method*/
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_eat);
        } else if (position == 1) {
            return mContext.getString(R.string.category_drink);
        } else if (position == 2) {
            return mContext.getString(R.string.category_havefun);
        } else {
            return mContext.getString(R.string.category_learn);
        }
    }
}
