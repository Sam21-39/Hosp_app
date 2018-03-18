package com.rahuldiatm.hospitalmanagementtest;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.io.ObjectInputValidation;

/**
 * Created by Sumit Pal on 15-03-2018.
 */

public class ViewPagerAdapter extends PagerAdapter {

    private Context context;
    private LayoutInflater layoutInflater;
    private int [] images = {R.drawable.hosp,R.drawable.hosp1,R.drawable.hosp2,R.drawable.hosp3};

    public ViewPagerAdapter(Context context){
        this.context = context;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.imageslider,null);
        ImageView imageView = (ImageView)view.findViewById(R.id.imageView);
        imageView.setImageResource(images [position]);

        ViewPager viewPager = (ViewPager) container;
        viewPager.addView(view, 0);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        ViewPager viewPager= (ViewPager)container;
        View view= (View)object;
        viewPager.removeView(view);
    }
}
