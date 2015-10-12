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
package com.amazonaws.services.dynamodb.model;

/**
 * Return Value
 */
public enum ReturnValue {
    
    NONE("NONE"),
    ALL_OLD("ALL_OLD"),
    UPDATED_OLD("UPDATED_OLD"),
    ALL_NEW("ALL_NEW"),
    UPDATED_NEW("UPDATED_NEW");

    private String value;

    private ReturnValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *            real value
     * @return ReturnValue corresponding to the value
     */
    public static ReturnValue fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        
        } else if ("NONE".equals(value)) {
            return ReturnValue.NONE;
        } else if ("ALL_OLD".equals(value)) {
            return ReturnValue.ALL_OLD;
        } else if ("UPDATED_OLD".equals(value)) {
            return ReturnValue.UPDATED_OLD;
        } else if ("ALL_NEW".equals(value)) {
            return ReturnValue.ALL_NEW;
        } else if ("UPDATED_NEW".equals(value)) {
            return ReturnValue.UPDATED_NEW;
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
    