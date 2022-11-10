package com.example.knu_notice;

// Scrapview 액티비티에서 리사이클러뷰에 쓸 파일

public class Scrap {
    int text_num;
    String text_classification;
    String text_title;
    String text_date;

    public Scrap(int text_num, String text_classification, String text_title, String text_date) {
        this.text_num = text_num;
        this.text_classification = text_classification;
        this.text_title = text_title;
        this.text_date = text_date;
    }

    public int getNum() {
        return text_num;
    }

    public String getClassification() {
        return text_classification;
    }

    public String getTitle() {
        return text_title;
    }

    public String getDate() {
        return text_date;
    }

    public void setNum(int text_num) {
        this.text_num = text_num;
    }

    public void setClassification(String text_classification) {
        this.text_classification = text_classification;
    }

    public void setTitle(String text_title) {
        this.text_title = text_title;
    }

    public void setDate(String text_date) {
        this.text_date = text_date;
    }






}
