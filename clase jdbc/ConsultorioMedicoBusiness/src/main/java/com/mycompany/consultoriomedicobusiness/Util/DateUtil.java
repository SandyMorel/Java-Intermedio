/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.consultoriomedicobusiness.Util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Sandy
 */
public class DateUtil {
    
    
    public static Date stringToDate(String date) {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd/MM/yyyy");

        try {
        return     simpleDateFormat.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }
    
}
