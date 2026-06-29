package org.siba.cloud.infrastructure;

import org.cloudsimplus.brokers.DatacenterBroker;
import org.cloudsimplus.cloudlets.Cloudlet;
import org.cloudsimplus.core.CloudSimPlus;
import org.cloudsimplus.datacenters.Datacenter;
import org.cloudsimplus.vms.Vm;
import org.siba.cloud.broker.BrokerManager;
import org.siba.cloud.cloudlet.CloudletManager;
import org.siba.cloud.datacenter.DatacenterManager;
import org.siba.cloud.vm.VMManager;

import java.util.List;

/**
 * ---------------------------------------------------------
 * InfrastructureManager
 *
 * Responsible for creating the entire Cloud Infrastructure.
 * ---------------------------------------------------------
 */
public class InfrastructureManager {

    private final CloudSimPlus simulation;

    private Datacenter datacenter;

    private DatacenterBroker broker;

    private List<Vm> vmList;

    private List<Cloudlet> cloudletList;

    public InfrastructureManager(CloudSimPlus simulation) {
        this.simulation = simulation;
    }

    public void initialize() {

        System.out.println("\n========================================");
        System.out.println("Initializing Cloud Infrastructure");
        System.out.println("========================================");

        datacenter = new DatacenterManager(simulation).createDatacenter();

        broker = new BrokerManager(simulation).createBroker();

        vmList = new VMManager().createVMs();

        cloudletList = new CloudletManager().createCloudlets();

        broker.submitVmList(vmList);

        broker.submitCloudletList(cloudletList);

        System.out.println("\nInfrastructure Initialized Successfully.");

    }

    public DatacenterBroker getBroker() {
        return broker;
    }

}