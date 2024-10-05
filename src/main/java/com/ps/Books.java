package com.ps;


public class Books {
    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedout;
    private String checkedOutTo;

    //constructors


    public Books(int id, String isbn, String title, boolean isCheckedout, String checkedOutTo) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedout = isCheckedout;
        this.checkedOutTo = checkedOutTo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCheckedout() {
        return isCheckedout;
    }

    public void setCheckedout(boolean ischeckedout) {
        isCheckedout = ischeckedout;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }

    public void SetIsCheckedout(boolean isCheckedout) {
        this.isCheckedout =isCheckedout;
    }
}
