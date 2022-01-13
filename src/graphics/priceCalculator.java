/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graphics;

import static graphics.mainTickeBookingFrame.bus1Lab;
import static graphics.mainTickeBookingFrame.bus2Lab;
import static graphics.mainTickeBookingFrame.business;
import static graphics.mainTickeBookingFrame.c;
import static graphics.mainTickeBookingFrame.cFrom;
import static graphics.mainTickeBookingFrame.cTo;
import static graphics.mainTickeBookingFrame.early;
import static graphics.mainTickeBookingFrame.earlyLab;
import static graphics.mainTickeBookingFrame.ec1Lab;
import static graphics.mainTickeBookingFrame.ec2Lab;
import static graphics.mainTickeBookingFrame.fromDropDownMenu;
import static graphics.mainTickeBookingFrame.m;
import static graphics.mainTickeBookingFrame.mFrom;
import static graphics.mainTickeBookingFrame.mTo;
import static graphics.mainTickeBookingFrame.normLab;
import static graphics.mainTickeBookingFrame.t;
import static graphics.mainTickeBookingFrame.tFrom;
import static graphics.mainTickeBookingFrame.tTo;
import static graphics.mainTickeBookingFrame.toDropDownMenu;
import static graphics.mainTickeBookingFrame.w;
import static graphics.mainTickeBookingFrame.wFrom;
import static graphics.mainTickeBookingFrame.wTo;

/**
 *
 * @author siddharthmehta
 */
public class priceCalculator {
    
public static void priceCalculator() {
        
//    if(fromDropDownMenu.getSelectedItem().equals(c) || toDropDownMenu.getSelectedItem().equals(c))
//        {
//    JOptionPane.showMessageDialog(null, "Please select a different arrival Destination");
//        }
//    if(fromDropDownMenu.getSelectedItem().equals(w) || toDropDownMenu.getSelectedItem().equals(w))
//        {
//    JOptionPane.showMessageDialog(null, "Please select a different arrival Destination");
//        }
//    if(fromDropDownMenu.getSelectedItem().equals(w) || toDropDownMenu.getSelectedItem().equals(w))
//        {
//    JOptionPane.showMessageDialog(null, "Please select a different arrival Destination");
//        }
//    if(fromDropDownMenu.getSelectedItem().equals(w) || toDropDownMenu.getSelectedItem().equals(w))
//        {
//    JOptionPane.showMessageDialog(null, "Please select a different arrival Destination");
//        }
    
    if(fromDropDownMenu.getSelectedItem().equals(c) || toDropDownMenu.getSelectedItem().equals(w))
        {
            ec1Lab.setText("CA $" + (cFrom + wTo));
            bus1Lab.setText("CA $" + ((cFrom + wTo) * business));
            ec2Lab.setText("CA $" + (cFrom + wTo + early));
            bus2Lab.setText("CA $" + ((cFrom + wTo + early) * business));
            normLab.setText("1hr 55m");
            earlyLab.setText("1hr 55m");
            
        }
    else if(fromDropDownMenu.getSelectedItem().equals(c) || toDropDownMenu.getSelectedItem().equals(t))
        {
            normLab.setText("3hr 45m");
            earlyLab.setText("3hr 45m");
            //mainTickeBookingFrame.jLabel3.setText("3hr 45m");
            ec1Lab.setText("CA $" + (cFrom + tTo));
            bus1Lab.setText("CA $" + ((cFrom + tTo) * business));
            ec2Lab.setText("CA $" + (cFrom + tTo + early));
            bus2Lab.setText("CA $" + ((cFrom + tTo + early) * business));
            
        }
    else if(fromDropDownMenu.getSelectedItem().equals(c) || toDropDownMenu.getSelectedItem().equals(m))
        {
            ec1Lab.setText("CA $" + (cFrom + mTo));
            bus1Lab.setText("CA $" + ((cFrom + mTo) * business));
            ec2Lab.setText("CA $" + (cFrom + mTo + early));
            bus2Lab.setText("CA $" + ((cFrom + mTo + early) * business));
            normLab.setText("4hr 05m");
            earlyLab.setText("4hr 05m");      
        }

    else if(fromDropDownMenu.getSelectedItem().equals(w) || toDropDownMenu.getSelectedItem().equals(c))
        {
            ec1Lab.setText("CA $" + (wFrom + cTo));
            bus1Lab.setText("CA $" + ((wFrom + cTo) * business));
            ec2Lab.setText("CA $" + (wFrom + cTo + early));
            bus2Lab.setText("CA $" + ((wFrom + cTo + early) * business));
            normLab.setText("2hr 15m");
            earlyLab.setText("2hr 15m"); 
        }
    else if(fromDropDownMenu.getSelectedItem().equals(w) || toDropDownMenu.getSelectedItem().equals(t))
        {
            ec1Lab.setText("CA $" + (wFrom + tTo));
            bus1Lab.setText("CA $" + ((wFrom + tTo) * business));
            ec2Lab.setText("CA $" + (wFrom + tTo + early));
            bus2Lab.setText("CA $" + ((wFrom + tTo + early) * business));
            normLab.setText("2hr 25m");
            earlyLab.setText("2hr 25m"); 
        }
    else if(fromDropDownMenu.getSelectedItem().equals(w) || toDropDownMenu.getSelectedItem().equals(m))
        {
            ec1Lab.setText("CA $" + (wFrom + mTo));
            bus1Lab.setText("CA $" + ((wFrom + mTo) * business));
            ec2Lab.setText("CA $" + (wFrom + mTo + early));
            bus2Lab.setText("CA $" + ((wFrom + mTo + early) * business));
            normLab.setText("2hr 45m");
            earlyLab.setText("2hr 45m");             
        }
    
    else if(fromDropDownMenu.getSelectedItem().equals(t) || toDropDownMenu.getSelectedItem().equals(c))
        {
            ec1Lab.setText("CA $" + (tFrom + cTo));
            bus1Lab.setText("CA $" + ((tFrom + cTo) * business));
            ec2Lab.setText("CA $" + (tFrom + cTo + early));
            bus2Lab.setText("CA $" + ((tFrom + cTo + early) * business));
            normLab.setText("4hr 20m");
            earlyLab.setText("4hr 20m"); 
        }
    else if(fromDropDownMenu.getSelectedItem().equals(t) || toDropDownMenu.getSelectedItem().equals(w))
        {
            ec1Lab.setText("CA $" + (tFrom + wTo));
            bus1Lab.setText("CA $" + ((tFrom + wTo) * business));
            ec2Lab.setText("CA $" + (tFrom + wTo + early));
            bus2Lab.setText("CA $" + ((tFrom + wTo + early) * business)); 
            normLab.setText("2hr 40m");
            earlyLab.setText("2hr 40m"); 
        }
    else if(fromDropDownMenu.getSelectedItem().equals(t) || toDropDownMenu.getSelectedItem().equals(m))
        {
            ec1Lab.setText("CA $" + (tFrom + mTo));
            bus1Lab.setText("CA $" + ((tFrom + mTo) * business));
            ec2Lab.setText("CA $" + (tFrom + mTo + early));
            bus2Lab.setText("CA $" + ((tFrom + mTo + early) * business));
            normLab.setText("1hr 15m");
            earlyLab.setText("1hr 15m"); 
        }
    
    else if(fromDropDownMenu.getSelectedItem().equals(m) || toDropDownMenu.getSelectedItem().equals(c))
        {
            ec1Lab.setText("CA $" + (mFrom + cTo));
            bus1Lab.setText("CA $" + ((mFrom + cTo) * business));
            ec2Lab.setText("CA $" + (mFrom + cTo + early));
            bus2Lab.setText("CA $" + ((mFrom + cTo + early) * business)); 
            normLab.setText("2hr 25m");
            earlyLab.setText("2hr 25m"); 
        }
    else if(fromDropDownMenu.getSelectedItem().equals(m) || toDropDownMenu.getSelectedItem().equals(w))
        {
            ec1Lab.setText("CA $" + (mFrom + wTo));
            bus1Lab.setText("CA $" + ((mFrom + wTo) * business));
            ec2Lab.setText("CA $" + (mFrom + wTo + early));
            bus2Lab.setText("CA $" + ((mFrom + wTo + early) * business));  
            normLab.setText("3hr 15m");
            earlyLab.setText("3hr 15m"); 
        }
    else if(fromDropDownMenu.getSelectedItem().equals(m) || toDropDownMenu.getSelectedItem().equals(t))
        {
            ec1Lab.setText("CA $" + (mFrom + tTo));
            bus1Lab.setText("CA $" + ((mFrom + tTo) * business));
            ec2Lab.setText("CA $" + (mFrom + tTo + early));
            bus2Lab.setText("CA $" + ((mFrom + tTo + early) * business));
            normLab.setText("3hr 15m");
            earlyLab.setText("3hr 15m"); 
            
        }    
    }

    
}
