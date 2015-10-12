/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.dynamodb.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import com.amazonaws.services.dynamodb.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import org.codehaus.jackson.JsonToken;
import static org.codehaus.jackson.JsonToken.*;

/**
 * Batch Write Item Result JSON Unmarshaller
 */
public class BatchWriteItemResultJsonUnmarshaller implements Unmarshaller<BatchWriteItemResult, JsonUnmarshallerContext> {

    

    public BatchWriteItemResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        BatchWriteItemResult batchWriteItemResult = new BatchWriteItemResult();

        
        
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.currentToken;
        if (token == null) token = context.nextToken();

        while (true) {
            if (token == null) break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("Responses", targetDepth)) {
                    batchWriteItemResult.setResponses(new MapUnmarshaller<String,BatchWriteResponse>(StringJsonUnmarshaller.getInstance(), BatchWriteResponseJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("UnprocessedItems", targetDepth)) {
                    batchWriteItemResult.setUnprocessedItems(new MapUnmarshaller<String,java.util.List<WriteRequest>>(StringJsonUnmarshaller.getInstance(), new ListUnmarshaller<WriteRequest>(WriteRequestJsonUnmarshaller.getInstance())).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getCurrentDepth() <= originalDepth) break;
            }
            token = context.nextToken();
        }
        
        return batchWriteItemResult;
    }

    private static BatchWriteItemResultJsonUnmarshaller instance;
    public static BatchWriteItemResultJsonUnmarshaller getInstance() {
        if (instance == null) instance = new BatchWriteItemResultJsonUnmarshaller();
        return instance;
    }
}
    