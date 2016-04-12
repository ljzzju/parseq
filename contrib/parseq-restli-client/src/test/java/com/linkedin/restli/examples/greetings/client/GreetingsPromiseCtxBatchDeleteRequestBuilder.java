
package com.linkedin.restli.examples.greetings.client;

import javax.annotation.Generated;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.BatchDeleteRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;
import com.linkedin.restli.examples.greetings.api.Greeting;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder", date = "Thu Mar 31 14:16:23 PDT 2016")
public class GreetingsPromiseCtxBatchDeleteRequestBuilder
    extends BatchDeleteRequestBuilderBase<Long, Greeting, GreetingsPromiseCtxBatchDeleteRequestBuilder>
{


    public GreetingsPromiseCtxBatchDeleteRequestBuilder(String baseUriTemplate, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, Greeting.class, resourceSpec, requestOptions);
    }

}
