package com.example.prueba3;

public class Question {
    private int mTextResId;
    private boolean mAnswerTrue;

    private int mBackButton;
    //construc
    public Question(int textResId, boolean answerTrue) {
        mTextResId = textResId;
        mAnswerTrue = answerTrue;
    }
    //gettes, setters
    public boolean ismAnswerTrue() {
        return mAnswerTrue;
    }

    public void setmAnswerTrue(boolean mAnswerTrue) {
        this.mAnswerTrue = mAnswerTrue;
    }

    public int getmTextResId() {
        return mTextResId;
    }

    public void setmTextResId(int mTextResId) {
        this.mTextResId = mTextResId;
    }

    public int getmBackButton() {
        return mBackButton;
    }

    public void setmBackButton(int mBackButton) {
        this.mBackButton = mBackButton;
    }
}
