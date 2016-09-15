/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.edcore.util;

public class HSBC {

    public static String getReferencia(String code) {

        String num1 = code.substring(7, 8);
        int ResMult1 = Integer.parseInt(num1) * 2;
        if (ResMult1 > 9) {
            String sub1Mult = Integer.toString(ResMult1).substring(0, 1);
            String sub2Mult = Integer.toString(ResMult1).substring(1, 2);
            int SumMult1 = Integer.parseInt(sub1Mult) + Integer.parseInt(sub2Mult);
            ResMult1 = SumMult1;
        }

        String num2 = code.substring(6, 7);
        int ResMult2 = Integer.parseInt(num2) * 1;
        if (ResMult2 > 9) {
            String sub1Mult = Integer.toString(ResMult2).substring(0, 1);
            String sub2Mult = Integer.toString(ResMult2).substring(1, 2);
            int SumMult2 = Integer.parseInt(sub1Mult) + Integer.parseInt(sub2Mult);
            ResMult2 = SumMult2;
        }

        String num3 = code.substring(5, 6);
        int ResMult3 = Integer.parseInt(num3) * 2;
        if (ResMult3 > 9) {
            String sub1Mult = Integer.toString(ResMult3).substring(0, 1);
            String sub2Mult = Integer.toString(ResMult3).substring(1, 2);
            int SumMult3 = Integer.parseInt(sub1Mult) + Integer.parseInt(sub2Mult);
            ResMult3 = SumMult3;
        }

        String num4 = code.substring(4, 5);
        int ResMult4 = Integer.parseInt(num4) * 1;
        if (ResMult4 > 9) {
            String sub1Mult = Integer.toString(ResMult4).substring(0, 1);
            String sub2Mult = Integer.toString(ResMult4).substring(1, 2);
            int SumMult4 = Integer.parseInt(sub1Mult) + Integer.parseInt(sub2Mult);
            ResMult4 = SumMult4;
        }

        String num5 = code.substring(3, 4);
        int ResMult5 = Integer.parseInt(num5) * 2;
        if (ResMult5 > 9) {
            String sub1Mult = Integer.toString(ResMult5).substring(0, 1);
            String sub2Mult = Integer.toString(ResMult5).substring(1, 2);
            int SumMult5 = Integer.parseInt(sub1Mult) + Integer.parseInt(sub2Mult);
            ResMult5 = SumMult5;
        }

        String num6 = code.substring(2, 3);
        int ResMult6 = Integer.parseInt(num6) * 1;
        if (ResMult6 > 9) {
            String sub1Mult = Integer.toString(ResMult6).substring(0, 1);
            String sub2Mult = Integer.toString(ResMult6).substring(1, 2);
            int SumMult6 = Integer.parseInt(sub1Mult) + Integer.parseInt(sub2Mult);
            ResMult6 = SumMult6;
        }

        String num7 = code.substring(1, 2);
        int ResMult7 = Integer.parseInt(num7) * 2;
        if (ResMult7 > 9) {
            String sub1Mult = Integer.toString(ResMult7).substring(0, 1);
            String sub2Mult = Integer.toString(ResMult7).substring(1, 2);
            int SumMult7 = Integer.parseInt(sub1Mult) + Integer.parseInt(sub2Mult);
            ResMult7 = SumMult7;
        }
        String num8 = code.substring(0, 1);
        int ResMult8 = Integer.parseInt(num8) * 1;
        if (ResMult8 > 9) {
            String sub1Mult = Integer.toString(ResMult8).substring(0, 1);
            String sub2Mult = Integer.toString(ResMult8).substring(1, 2);
            int SumMult8 = Integer.parseInt(sub1Mult) + Integer.parseInt(sub2Mult);
            ResMult8 = SumMult8;
        }

        int TotalMult = ResMult1 + ResMult2 + ResMult3 + ResMult4 + ResMult5 + ResMult6 + ResMult7 + ResMult8;
        if (TotalMult > 9) {
            String unidad = Integer.toString(TotalMult).substring(1, 2);
            TotalMult = Integer.parseInt(unidad);
        }
        int ref = 10 - TotalMult;
        if (ref == 10) {
            ref = 0;
        }
        if (code.length() == 8) {
            return code + "" + Integer.toString(ref);
        } else {
            return "";
        }
    }
}
