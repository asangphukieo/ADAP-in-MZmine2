/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.sf.mzmine.modules.peaklistmethods.peakpicking.adap3decomposition;

import java.text.NumberFormat;
import net.sf.mzmine.parameters.Parameter;
import net.sf.mzmine.parameters.impl.SimpleParameterSet;
import net.sf.mzmine.parameters.parametertypes.DoubleParameter;
import net.sf.mzmine.parameters.parametertypes.IntegerParameter;

/**
 *
 * @author aleksandrsmirnov
 */
public class ADAP3EICDecompositionParameters extends SimpleParameterSet {
    
    public static final DoubleParameter MAX_RT_CLUSTER_WIDTH =
            new DoubleParameter("Maximum size of Retention-Time cluster",
                    "This parameter determines how many clusters we have: the large size the fewer clusters", 
                    NumberFormat.getNumberInstance(), 60.0);
    
    public static final DoubleParameter MAX_SHAPE_CLUSTER_WIDTH =
            new DoubleParameter("Maxmimum size of Shape cluster",
                    "This parameter determines how many clusters we have: the large size the fewer clusters", 
                    NumberFormat.getNumberInstance(), 18.0);
    
    public static final IntegerParameter MIN_CLUSTER_SIZE =
            new IntegerParameter("Minimum number of peaks in a cluster",
                    "If number of peaks in a cluster is less then this parameter, the cluster is discarded",
                    2);
    
    public static final IntegerParameter MIN_WINDOW_SIZE =
            new IntegerParameter("Minimum number of peaks in a window",
                    "If number of peaks in TIC-window is less then this parameter, the window is skipped",
                    5);
            
    public static final DoubleParameter MIN_CLUSTER_INTENSITY =
            new DoubleParameter("Minimum height of a cluster",
                    "If all peaks in a cluster have height below this parameter, teh cluster is discarded",
                    NumberFormat.getNumberInstance(), 500.0);
    
    public static final DoubleParameter MIN_MODEL_STN =
            new DoubleParameter("Minimum Signal-to-Noise ratio",
                    "Minimum Signal-to-Noise ratio that the model peak can have",
                    NumberFormat.getNumberInstance(), 100.0);
    
    public static final DoubleParameter MIN_MODEL_SHARPNESS =
            new DoubleParameter("Minimim Shapness",
                    "Minimum sharpness that the model peak can have",
                    NumberFormat.getNumberInstance(), 10.0);
    
    public static final DoubleParameter RT_TOLERANCE =
            new DoubleParameter("Retention Time Range (min)",
                    "If two clusters lie within thie retention Time range and have a similar shape, one of them is discarded",
                    NumberFormat.getNumberInstance(), 0.5);
    
    public ADAP3EICDecompositionParameters() {
        super(new Parameter[] {MAX_RT_CLUSTER_WIDTH, MAX_SHAPE_CLUSTER_WIDTH,
                MIN_CLUSTER_SIZE, MIN_WINDOW_SIZE, MIN_CLUSTER_INTENSITY,
                MIN_MODEL_STN, MIN_MODEL_SHARPNESS, RT_TOLERANCE});
    }
    
}
