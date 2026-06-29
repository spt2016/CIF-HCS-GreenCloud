package org.siba.cloud.broker;

import org.cloudsimplus.brokers.DatacenterBroker;
import org.cloudsimplus.brokers.DatacenterBrokerSimple;
import org.cloudsimplus.core.CloudSimPlus;

public class BrokerManager {

    private final CloudSimPlus simulation;

    public BrokerManager(CloudSimPlus simulation) {
        this.simulation = simulation;
    }

    public DatacenterBroker createBroker() {

        System.out.println("--------------------------------");
        System.out.println("Creating Broker");
        System.out.println("--------------------------------");

        DatacenterBroker broker = new DatacenterBrokerSimple(simulation);

        System.out.println("Broker Created Successfully.");

        return broker;
    }
}