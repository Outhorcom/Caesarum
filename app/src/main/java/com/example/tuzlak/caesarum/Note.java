package com.example.tuzlak.caesarum;

import java.util.Date;

/**
 * Created by Tuzlak on 8/25/2017.
 */

public class Note {

    public Note(String title, String note, Date date) {
        this.title = title;
        this.note = note;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    private String title;
    private String note;
    private Date date;
}
