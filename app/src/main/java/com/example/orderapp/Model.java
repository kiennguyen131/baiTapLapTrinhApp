package com.example.orderapp;
// xay dungj model gom ten, mo ta, anh do uong
public class Model {


    String mDrinkName;
    String mDrinkDetail;
    int mDrinkPhoto;//contructor
    public Model(String mDrinkName, String mDrinkDetail, int mDrinkPhoto) {
        this.mDrinkName = mDrinkName;
        this.mDrinkDetail = mDrinkDetail;
        this.mDrinkPhoto = mDrinkPhoto;
    }


// get set

    public void setmDrinkName(String mDrinkName) {
        this.mDrinkName = mDrinkName;
    }

    public void setmDrinkDetail(String mDrinkDetail) {
        this.mDrinkDetail = mDrinkDetail;
    }

    public void setmDrinkPhoto(int mDrinkPhoto) {
        this.mDrinkPhoto = mDrinkPhoto;
    }

    public String getmDrinkName() {
        return mDrinkName;
    }

    public String getmDrinkDetail() {
        return mDrinkDetail;
    }

    public int getmDrinkPhoto() {
        return mDrinkPhoto;
    }
}
