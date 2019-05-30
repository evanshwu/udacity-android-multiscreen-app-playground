package com.bla.haha;

public class Words {
    private String originWord;
    private String subWord;
    private int imageResId = NO_IMAGES_PROVIDED;

    private static final int NO_IMAGES_PROVIDED = -1;

    public Words(String originWord, String subWord, int imageResId){
        setOriginWord(originWord);
        setSubWord(subWord);
        setImageResId(imageResId);
    }

    public Words(String originWord, String subWord){
        setOriginWord(originWord);
        setSubWord(subWord);
    }

    public void setOriginWord(String originWord) {
        this.originWord = originWord;
    }

    public void setSubWord(String subWord){
        this.subWord = subWord;
    }

    public String getOriginWord(){
        return originWord;
    }

    public String getSubWord() {
        return subWord;
    }

    public int getImageResId() {
        return imageResId;
    }

    public void setImageResId(int imageResId) {
        this.imageResId = imageResId;
    }

    public boolean hasImage(){
        return imageResId != NO_IMAGES_PROVIDED;
    }
}
