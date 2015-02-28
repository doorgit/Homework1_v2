package com.example.felcioud.homework1_v2;

import android.app.Application;

/**
 * Created by S9918200H on 2/24/2015.
 */
public class GradeItem extends Application{
    private String mName;
    private float mMarks;
    private float mTotalMarks;
    private int mWeightage;

    public GradeItem(String mName, float mMarks, float mTotalMarks, int mWeightage){
        this.mName = mName;
        this.mMarks = mMarks;
        this.mTotalMarks = mTotalMarks;
        this.mWeightage = mWeightage;

    }


    public int getWeightage() {
        return mWeightage;
    }

    public void setWeightage(int weightage) {
        mWeightage = weightage;
    }

    public float getTotalMarks() {
        return mTotalMarks;
    }

    public void setTotalMarks(float totalMarks) {
        mTotalMarks = totalMarks;
    }

    public float getMarks() {
        return mMarks;
    }

    public void setMarks(float marks) {
        mMarks = marks;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

}
