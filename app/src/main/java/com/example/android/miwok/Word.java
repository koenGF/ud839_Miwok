package com.example.android.miwok;

public class Word {

    private String mDefaultTranslation;
    private String mMiwoktranslation;
    private int mImageResourceId = -1;
    private int mAudioResourceId;

    public String getMiwoktranslation() {
        return mMiwoktranslation;
    }
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }
    public int getImageResourceId() {return mImageResourceId;}
    public int getAudioResourceId() {return mAudioResourceId;}
    public boolean hasImage() {return mImageResourceId != -1;
    }

    /**
     * constructor for a word object without an image
     * @param defaultTranslation
     * @param miwoktranslation
     * @param audioResourceId
     */
    public Word(String defaultTranslation, String miwoktranslation, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwoktranslation = miwoktranslation;
        mAudioResourceId = audioResourceId;
    }

    /**
     * constructor for a word object with an image
     * @param defaultTranslation
     * @param miwoktranslation
     * @param imageResourceId
     * @param audioResourceId
     */
    public Word(String defaultTranslation, String miwoktranslation, int imageResourceId, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwoktranslation = miwoktranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }
}