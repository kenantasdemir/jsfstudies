package com.kenant42.jsfstudies;

import jakarta.faces.model.DataModel;

import javax.xml.crypto.Data;

public final class Sirala<T> extends DataModel<T> {


    @Override
    public boolean isRowAvailable() {
        return false;
    }

    @Override
    public int getRowCount() {
        return 0;
    }

    @Override
    public T getRowData() {
        return null;
    }

    @Override
    public int getRowIndex() {
        return 0;
    }

    @Override
    public void setRowIndex(int i) {

    }

    @Override
    public Object getWrappedData() {
        return null;
    }

    @Override
    public void setWrappedData(Object o) {

    }
}
