package com.example.French;

public class Word {
   private String mdefaulttranslation;
   private String mmiwoktranslation;
    private int  imgid= NO_IMAGE;
    private int maudid;
    private static final int NO_IMAGE=-1;
    public  Word(String defaulttranslation, String miwoktranslation )
    {
        mdefaulttranslation=defaulttranslation;
        mmiwoktranslation=miwoktranslation;

    }
    public Word (String defaulttranslation, String miwoktranslation, int id )
    {
        mdefaulttranslation=defaulttranslation;
        mmiwoktranslation=miwoktranslation;
        imgid=id;
    }

    public Word(String defaulttranslation, String miwoktranslation, int id,  int audresid) {
        mdefaulttranslation=defaulttranslation;
        mmiwoktranslation=miwoktranslation;
        imgid=id;
        maudid=audresid;
    }



    public String getdefaulttranslation()
    {
        return  mdefaulttranslation;
    }
    public String getmiwoktranslation(){

        return mmiwoktranslation;
    }
    public  int getimageid(){
        return imgid;
    }
    public boolean hasimage()
    {
        return imgid!=NO_IMAGE;
    }
    public int getaudresid(){
        return maudid;}
    }

