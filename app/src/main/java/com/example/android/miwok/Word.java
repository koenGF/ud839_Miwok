package com.example.android.miwok;

public class Word {

    private String mDefaultTranslation;
    private String mMiwoktranslation;

    public String getMiwoktranslation() {
        return mMiwoktranslation;
    }
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }


    public Word(String defaultTranslation, String miwoktranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwoktranslation = miwoktranslation;
    }
}