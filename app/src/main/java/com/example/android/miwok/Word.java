package com.example.android.miwok;

public class Word {
    private String mdefaultTranslation;

    private String mMiwokTranslation;

    private int mImageResorceId=NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED =-1;

    public Word(String Miwoktranslation , String DefaultTranslation){
        mdefaultTranslation=DefaultTranslation;
        mMiwokTranslation=Miwoktranslation;
    }
    public Word(String Miwoktranslation , String DefaultTranslation,int imageResourceId){
        mdefaultTranslation=DefaultTranslation;
        mMiwokTranslation=Miwoktranslation;
        mImageResorceId=imageResourceId;
    }



    public String getdefaultTranslation(){
        return mdefaultTranslation;
    }

    public  String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    public  int getImageResourceId(){
        return mImageResorceId;
    }

    public boolean hasImage(){
        return mImageResorceId != NO_IMAGE_PROVIDED;
    }
}
