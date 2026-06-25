package org.siba.cloud.datacenter;

import org.cloudsimplus.core.CloudSimPlus;

public class DatacenterManager {

    private final CloudSimPlus simulation;

    public DatacenterManager(CloudSimPlus simulation) {
        this.simulation = simulation;
    }

    public void createDatacenter() {

        System.out.println("--------------------------------------");
        System.out.println("Creating Datacenter...");
        System.out.println("--------------------------------------");

    }
}