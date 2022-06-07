package thesimpleems_16nov;
    
// PART TIME EMPLOYEE

public class PTE extends EmployeeInfo {
    
    // ATTRIBUTES
    public double hourlyWage;
    public double hoursPerWeek;
    public double weeksPerYear;
    
    // CONSTRUCTOR
    public PTE(int eN, String fN, String lN, String g, String wL, double dR, double hW, double hPW, double wPY) {       
        
        super(eN, fN, lN, g, wL, dR);
        hourlyWage = hW;
        hoursPerWeek = hPW;
        weeksPerYear = wPY;
        
    }
    
    // METHODS
    
    public double CalcPTEAnnualNetIncome() { // methods
        return (hourlyWage * hoursPerWeek * weeksPerYear) * (1 - deductRate);
    }
    
    public double getHourlyWage() {
        return hourlyWage;
    }

    public double getHoursPerWeek() {
        return hoursPerWeek;
    }

    public double getWeeksPerYear() {
        return weeksPerYear;
    }
}
