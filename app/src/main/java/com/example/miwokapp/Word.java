package com.example.miwokapp;

public class Word {

    /** Default translation for the word */
    private final String mDefaultTranslation;

    /** Miwok translation for the word */
    private final String mMiwokTranslation;

    /** Miwok Image for the word */
    private final int mImage;

    private final int mAudio;


    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation is the word in the Miwok language
     */
    public Word(String defaultTranslation, String miwokTranslation, int imageMiwok,int audioMiwok) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImage = imageMiwok;
        mAudio = audioMiwok;

    }

    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImage(){ return mImage; }

    public int getAudioResourceId(){ return mAudio; }

}
