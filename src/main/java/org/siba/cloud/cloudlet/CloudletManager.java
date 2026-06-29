package org.siba.cloud.cloudlet;

import org.cloudsimplus.cloudlets.Cloudlet;
import org.cloudsimplus.cloudlets.CloudletSimple;
import org.cloudsimplus.utilizationmodels.UtilizationModelDynamic;
import org.siba.cloud.config.CloudConfiguration;

import java.util.ArrayList;
import java.util.List;

public class CloudletManager {

    public List<Cloudlet> createCloudlets() {

        System.out.println("--------------------------------");
        System.out.println("Creating Cloudlets");
        System.out.println("--------------------------------");

        List<Cloudlet> cloudletList = new ArrayList<>();

        UtilizationModelDynamic utilization =
                new UtilizationModelDynamic(0.5);

        for(int i=0;i<CloudConfiguration.NUMBER_OF_CLOUDLETS;i++){

            Cloudlet cloudlet = new CloudletSimple(
                    CloudConfiguration.CLOUDLET_LENGTH,
                    CloudConfiguration.CLOUDLET_PES,
                    utilization
            );

            cloudletList.add(cloudlet);

            System.out.println("Cloudlet " + (i+1) + " Created");
        }

        return cloudletList;
    }
}