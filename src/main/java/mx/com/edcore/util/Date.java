/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.edcore.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Date {

    public static java.sql.Date getSqlDate(){
        Calendar hoy = GregorianCalendar.getInstance();
        java.sql.Date date = new java.sql.Date(hoy.getTimeInMillis());
        return date;
    }
    public static java.sql.Date getSqlDate(String date){
        java.sql.Date sql = null;
        try {
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            java.util.Date parsed = format.parse(date);
            sql = new java.sql.Date(parsed.getTime());
            
        } catch (ParseException ex) {
            Logger.getLogger(Date.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sql;
    }
	public static String getToDay(){
		Calendar hoy = GregorianCalendar.getInstance();
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		return format.format(hoy.getTime());
	}
	public static String Format(String mask,String fecha){
		Calendar cal = GregorianCalendar.getInstance();
		SimpleDateFormat format = new SimpleDateFormat(mask);
		String []datos = {"2000","01","01"};
		int anio;
		int mes;
		int dia;
		if(fecha != null){
			if(fecha.contains("-")){
				datos = fecha.split("-");
			} else if(fecha.contains("/")){
				datos = fecha.split("/");
			}
			if(datos[0].length() == 4){
				anio = Integer.parseInt(datos[0]);
				mes = Integer.parseInt(datos[1])-1;
				dia = Integer.parseInt(datos[2]);
			}else{
				anio = Integer.parseInt(datos[2]);
				mes = Integer.parseInt(datos[1])-1;
				dia = Integer.parseInt(datos[0]);
			}
			cal.set(anio,mes,dia);
		}
		return format.format(cal.getTime());
	}
        public static String getMonth(int month){
            String monthtxt="";
            switch(month){
                case 1: monthtxt = "ENERO"; break;
                case 2: monthtxt = "FEBRERO"; break;
                case 3: monthtxt = "MARZO"; break;
                case 4: monthtxt = "ABRIL"; break;
                case 5: monthtxt = "MAYO"; break;
                case 6: monthtxt = "JUNIO"; break;
                case 7: monthtxt = "JULIO"; break;
                case 8: monthtxt = "AGOSTO"; break;
                case 9: monthtxt = "SEPTIEMBRE"; break;
                case 10: monthtxt = "OCTUBRE"; break;
                case 11: monthtxt = "NOVIEMBRE"; break;
                case 12: monthtxt = "DICIEMBRE"; break;
            }
            return monthtxt;
        }
}
