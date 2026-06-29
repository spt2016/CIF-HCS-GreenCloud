package org.siba.cloud.metrics;

import org.cloudsimplus.cloudlets.Cloudlet;

import java.util.List;

/**
 * -------------------------------------------------------------
 * SimulationMetrics
 *
 * Displays basic simulation statistics.
 * -------------------------------------------------------------
 */
public class SimulationMetrics {

    public void printSummary(List<Cloudlet> finishedCloudlets) {

        System.out.println("\n======================================");
        System.out.println("Simulation Summary");
        System.out.println("======================================");

        System.out.println("Finished Cloudlets : "
                + finishedCloudlets.size());

    }

}