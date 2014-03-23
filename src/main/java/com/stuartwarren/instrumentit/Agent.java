/**
 * 
 */
package com.stuartwarren.instrumentit;

import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.Instrumentation;

import org.aspectj.weaver.loadtime.*;

/**
 * @author Stuart Warren 
 * @date 23 Mar 2014
 *
 */
public class Agent {
    
    private static Instrumentation s_instrumentation;
    private static ClassFileTransformer s_transformer = new ClassPreProcessorAgentAdapter();

    /**
     * @param args
     */
    public static void premain(String args, Instrumentation inst) throws Exception {
        System.out.println("Loading Agent.."); 
        inst.addTransformer(new Transfomer());
        if (s_instrumentation != null) {
            return;
        }
        s_instrumentation = inst;
        s_instrumentation.addTransformer(s_transformer);
    }

}
