package org.siba.cloud.datacenter;

import org.cloudsimplus.core.CloudSimPlus;
import org.cloudsimplus.datacenters.Datacenter;
import org.cloudsimplus.datacenters.DatacenterSimple;
import org.cloudsimplus.hosts.Host;

import java.util.List;

public class DatacenterManager {

    private final CloudSimPlus simulation;

    public DatacenterManager(CloudSimPlus simulation) {
        this.simulation = simulation;
    }

    public Datacenter createDatacenter() {

        System.out.println("--------------------------------");
        System.out.println("Creating Datacenter");
        System.out.println("--------------------------------");

        HostManager hostManager = new HostManager();

        List<Host> hostList = hostManager.createHosts();

        Datacenter datacenter =
                new DatacenterSimple(simulation, hostList);

        System.out.println("Datacenter Created Successfully.");

        return datacenter;
    }
}