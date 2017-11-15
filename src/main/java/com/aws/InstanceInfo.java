package com.aws;

import com.amazonaws.util.*;

public class InstanceInfo {

    public static void main(String[] args) {
        // Resolve the instanceId
        System.out.println("InstanceId: " + EC2MetadataUtils.getInstanceId());
        System.out.println("InstanceType: " + EC2MetadataUtils.getInstanceType());
        // Resolve (first/primary) private IP
        System.out.println("PrivateIpAddress: " + EC2MetadataUtils.getPrivateIpAddress());
        System.out.println("AvailabilityZone: " + EC2MetadataUtils.getAvailabilityZone());
        System.out.println("EC2InstanceRegion: " + EC2MetadataUtils.getEC2InstanceRegion());
        System.out.println("LocalHostName: " + EC2MetadataUtils.getLocalHostName());
        System.out.println("MacAddress: " + EC2MetadataUtils.getMacAddress());
        System.out.println("SecurityGroups: " + EC2MetadataUtils.getSecurityGroups());
        System.out.println("\n\n");
        EC2MetadataUtils.InstanceInfo instanceInfo = EC2MetadataUtils.getInstanceInfo();
        System.out.println("InstanceId using InstanceInfo obj: " + instanceInfo.getInstanceId());
        // Resolve (first/primary) private IP
        System.out.println("PrivateIp using InstanceInfo obj: " + instanceInfo.getPrivateIp());
        System.out.println("AccountId using InstanceInfo obj: " + instanceInfo.getAccountId());
        System.out.println("ImageId using InstanceInfo obj: " + instanceInfo.getImageId());
        System.out.println("Region using InstanceInfo obj: " + instanceInfo.getRegion());

    }
}
