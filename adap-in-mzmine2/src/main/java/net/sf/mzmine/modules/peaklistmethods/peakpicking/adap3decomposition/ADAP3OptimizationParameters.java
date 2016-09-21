/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.sf.mzmine.modules.peaklistmethods.peakpicking.adap3decomposition;

import java.text.NumberFormat;
import net.sf.mzmine.parameters.Parameter;
import net.sf.mzmine.parameters.impl.SimpleParameterSet;
import net.sf.mzmine.parameters.parametertypes.BooleanParameter;
import net.sf.mzmine.parameters.parametertypes.DoubleParameter;
import net.sf.mzmine.parameters.parametertypes.IntegerParameter;

/**
 *
 * @author aleksandrsmirnov
 */
public class ADAP3OptimizationParameters extends SimpleParameterSet {
    
    static NumberFormat numberFormat = NumberFormat.getInstance();
    
    public static final DoubleParameter GRADIENT_TOLERANCE =
            new DoubleParameter("Minimum gradient norm increment",
                    "Stop optimization if the gradient norm increment is below this parameter",
                    numberFormat, 1e-5);
    
    public static final DoubleParameter COST_TOLERANCE =
            new DoubleParameter("Minimum cost-function increment",
                    "Stop optimization if the cost-function increment is below this parameter",
                    numberFormat, 1e-6);
    
    public static final DoubleParameter ALPHA =
            new DoubleParameter("Alpha-parameter",
                    "Alpha determines spe-size on each increment",
                    NumberFormat.getNumberInstance(), 10.0);
    
    public static final IntegerParameter MAX_ITERATION =
            new IntegerParameter("Maxmum number of iterations",
                    "Stop optimization if the number of iterations exceeds this parameter",
                    4000);
    
    public static final BooleanParameter VERBOSE =
            new BooleanParameter("Verbose Mode",
            "If selected, optimization results will be printed out", false);
    
    public ADAP3OptimizationParameters() {
        super(new Parameter[] {GRADIENT_TOLERANCE, COST_TOLERANCE, ALPHA,
                MAX_ITERATION, VERBOSE});
        
        numberFormat.setMaximumFractionDigits(24);
    }
}