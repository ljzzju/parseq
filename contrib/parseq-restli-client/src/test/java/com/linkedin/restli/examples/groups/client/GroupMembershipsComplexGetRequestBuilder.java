
package com.linkedin.restli.examples.groups.client;

import javax.annotation.Generated;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.GetRequestBuilderBase;
import com.linkedin.restli.common.ComplexResourceKey;
import com.linkedin.restli.common.ResourceSpec;
import com.linkedin.restli.examples.groups.api.ComplexKeyGroupMembership;
import com.linkedin.restli.examples.groups.api.GroupMembershipKey;
import com.linkedin.restli.examples.groups.api.GroupMembershipParam;
import com.linkedin.restli.examples.groups.api.GroupMembershipQueryParam;
import com.linkedin.restli.examples.groups.api.GroupMembershipQueryParamArray;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder", date = "Thu Mar 31 14:16:24 PDT 2016")
public class GroupMembershipsComplexGetRequestBuilder
    extends GetRequestBuilderBase<ComplexResourceKey<GroupMembershipKey, GroupMembershipParam> , ComplexKeyGroupMembership, GroupMembershipsComplexGetRequestBuilder>
{


    public GroupMembershipsComplexGetRequestBuilder(String baseUriTemplate, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, ComplexKeyGroupMembership.class, resourceSpec, requestOptions);
    }

    public GroupMembershipsComplexGetRequestBuilder testParamParam(GroupMembershipParam value) {
        super.setParam("testParam", value, GroupMembershipParam.class);
        return this;
    }

    public GroupMembershipsComplexGetRequestBuilder testParamArrayParam(GroupMembershipQueryParamArray value) {
        super.setParam("testParamArray", value, GroupMembershipQueryParamArray.class);
        return this;
    }

    public GroupMembershipsComplexGetRequestBuilder testParamArrayParam(Iterable<GroupMembershipQueryParam> value) {
        super.setParam("testParamArray", value, GroupMembershipQueryParam.class);
        return this;
    }

    public GroupMembershipsComplexGetRequestBuilder addTestParamArrayParam(GroupMembershipQueryParam value) {
        super.addParam("testParamArray", value, GroupMembershipQueryParam.class);
        return this;
    }

}
