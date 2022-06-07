package thesimpleems_16nov;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author P0068839
 */

// FULL TIME EMPLOYEE

public class FTE extends EmployeeInfo {
    
    /**
     *
     */
    
    // ATTRIBUTES
    public double yearlySalary;
    
    /**
     *
     * @param eN
     * @param fN
     * @param lN
     * @param g
     * @param wL
     * @param dR
     * @param yS
     */
    
    // CONSTRUCTOR 
    
    public FTE(int eN, String fN, String lN, String g, String wL, double dR, double yS) {
        super(eN, fN, lN, g, wL, dR);
        yearlySalary = yS;
        
    }
    
    // METHODS
    
    public double getYearlySalary() {
        return yearlySalary;
    }
    
    
    public double calcAnnualNetIncome() { // Method that calculated the annual net income based on a yearly salary.
        return (yearlySalary *(1.0 - deductRate));
    }
    
}
