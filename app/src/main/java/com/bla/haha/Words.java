package com.bla.haha;

public class Words {
    private String originWord;
    private String subWord;

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
}
