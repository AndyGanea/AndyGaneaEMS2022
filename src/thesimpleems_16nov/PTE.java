package thesimpleems_16nov;
    
// PART TIME EMPLOYEE

public class PTE extends EmployeeInfo {
    
    
    public double hourlyWage;
    public double hoursPerWeek;
    public double weeksPerYear;
    
    
    public PTE(int eN, String fN, String lN, int g, int wL, double dR, double hW, double hPW, double wPY) {       
        
        super(eN, fN, lN, g, wL, dR);
        hourlyWage = hW;
        hoursPerWeek = hPW;
        weeksPerYear = wPY;
        
    }
    
    public double CalcPTEAnnualNetIncome() {
        return (hourlyWage * hoursPerWeek * weeksPerYear) * (1 - deductRate);
    }
}
