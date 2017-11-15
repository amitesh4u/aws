# Utility to get AWS instance details

## Build as JAR
```
mvn clean package
```

It will create the JAR _aws-instance-info-jar-with-dependencies.jar_

### Place this JAR in AWS instance

### Run it using JAVA
```
java -jar aws-instance-info-jar-with-dependencies.jar
```
    
### Sample Output:

```
InstanceId: i-bxxxxxxx
InstanceType: t2.micro
PrivateIpAddress: xxx.xx.xx.xxx
AvailabilityZone: us-east-1a
EC2InstanceRegion: us-east-1
LocalHostName: ip-xxx-xx-xx-xxx.ec2.internal
MacAddress: xx:xx:xx:xx:xx:xx
SecurityGroups: [private]


InstanceId using InstanceInfo obj: i-bxxxxxxx
PrivateIp using InstanceInfo obj: xxx.xx.xx.xxx
AccountId using InstanceInfo obj: xxxxxxxxxxxx
ImageId using InstanceInfo obj: ami-xxxxxxxx
Region using InstanceInfo obj: us-east-1
```
