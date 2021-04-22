package com.example.android.miwok;

public class Word {

    private String mDefaultTranslation;
    private String mMiwoktranslation;
    private int mImageResourceId = -1;

    public String getMiwoktranslation() {
        return mMiwoktranslation;
    }
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }
    public int getImageResourceId() {return mImageResourceId;}
    public boolean hasImage() {return mImageResourceId != -1;
    }

    public Word(String defaultTranslation, String miwoktranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwoktranslation = miwoktranslation;
    }

    public Word(String mDefaultTranslation, String mMiwoktranslation, int mImageResourceId) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwoktranslation = mMiwoktranslation;
        this.mImageResourceId = mImageResourceId;
    }
}