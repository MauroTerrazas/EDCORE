/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.edcore.util;

import java.util.List;

/**
 *
 * @author Gabriel Cisneros Landeros
 * @version 1.0.0
 */
public class JsonObject {
    
    int iTotalRecords;
    int iTotalDisplayRecords;
    int sEcho;
    String sColumns;
    List aaData;

    public int getiTotalRecords() {
    return iTotalRecords;
    }
    public void setiTotalRecords(int iTotalRecords) {
    this.iTotalRecords = iTotalRecords;
    }

    public int getiTotalDisplayRecords() {
    return iTotalDisplayRecords;
    }
    public void setiTotalDisplayRecords(int iTotalDisplayRecords) {
    this.iTotalDisplayRecords = iTotalDisplayRecords;
    }

    public int getsEcho() {
    return sEcho;
    }
    public void setsEcho(int sEcho) {
    this.sEcho = sEcho;
    }

    public String getsColumns() {
    return sColumns;
    }
    public void setsColumns(String sColumns) {
    this.sColumns = sColumns;
    }

    public List getAaData() {
        return aaData;
    }
    public void setAaData(List aaData) {
        this.aaData = aaData;
    }

}
