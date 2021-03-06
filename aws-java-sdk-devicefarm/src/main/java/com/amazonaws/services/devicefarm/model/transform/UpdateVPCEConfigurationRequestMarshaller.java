/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.devicefarm.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.devicefarm.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateVPCEConfigurationRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateVPCEConfigurationRequestMarshaller {

    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("arn").build();
    private static final MarshallingInfo<String> VPCECONFIGURATIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("vpceConfigurationName").build();
    private static final MarshallingInfo<String> VPCESERVICENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("vpceServiceName").build();
    private static final MarshallingInfo<String> SERVICEDNSNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("serviceDnsName").build();
    private static final MarshallingInfo<String> VPCECONFIGURATIONDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("vpceConfigurationDescription").build();

    private static final UpdateVPCEConfigurationRequestMarshaller instance = new UpdateVPCEConfigurationRequestMarshaller();

    public static UpdateVPCEConfigurationRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateVPCEConfigurationRequest updateVPCEConfigurationRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateVPCEConfigurationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateVPCEConfigurationRequest.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(updateVPCEConfigurationRequest.getVpceConfigurationName(), VPCECONFIGURATIONNAME_BINDING);
            protocolMarshaller.marshall(updateVPCEConfigurationRequest.getVpceServiceName(), VPCESERVICENAME_BINDING);
            protocolMarshaller.marshall(updateVPCEConfigurationRequest.getServiceDnsName(), SERVICEDNSNAME_BINDING);
            protocolMarshaller.marshall(updateVPCEConfigurationRequest.getVpceConfigurationDescription(), VPCECONFIGURATIONDESCRIPTION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
