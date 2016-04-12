
package com.linkedin.restli.examples.typeref.client;

import javax.annotation.Generated;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.ActionRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder", date = "Thu Mar 31 14:16:24 PDT 2016")
public class TyperefDoCustomNonNegativeLongRefRequestBuilder
    extends ActionRequestBuilderBase<Void, com.linkedin.restli.examples.custom.types.CustomNonNegativeLong, TyperefDoCustomNonNegativeLongRefRequestBuilder>
{


    public TyperefDoCustomNonNegativeLongRefRequestBuilder(String baseUriTemplate, Class<com.linkedin.restli.examples.custom.types.CustomNonNegativeLong> returnClass, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, returnClass, resourceSpec, requestOptions);
        super.name("CustomNonNegativeLongRef");
    }

    public TyperefDoCustomNonNegativeLongRefRequestBuilder arg1Param(com.linkedin.restli.examples.custom.types.CustomNonNegativeLong value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("CustomNonNegativeLongRef").getFieldDef("arg1"), value);
        return this;
    }

}
