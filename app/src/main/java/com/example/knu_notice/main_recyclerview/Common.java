package com.example.knu_notice.main_recyclerview;

public class Common {
    int text_num;
    String text_title;
    String text_date;
    int star_img;

    public Common(int text_num, String text_title, String text_date, int star_img) {
        this.text_num = text_num;
        this.text_title = text_title;
        this.text_date = text_date;
        this.star_img = star_img;
    }

    public int getNum() {
        return text_num;
    }

    public String getTitle() {
        return text_title;
    }

    public String getDate() {
        return text_date;
    }

    public int getStar() {
        return star_img;
    }

    public void setNum(int text_num) {
        this.text_num = text_num;
    }

    public void setTitle(String text_title) {
        this.text_title = text_title;
    }

    public void setDate(String text_date) {
        this.text_date = text_date;
    }

    public void setStar(int star_img) {
        this.star_img = star_img;
    }


}
