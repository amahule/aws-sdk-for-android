/*
 * Copyright 2012 Amazon Technologies, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazonaws.services.s3.transfer.internal;

import java.util.Collection;

import com.amazonaws.services.s3.transfer.MultipleFileUpload;
import com.amazonaws.services.s3.transfer.TransferProgress;
import com.amazonaws.services.s3.transfer.Upload;

/**
 * Multiple file upload when uploading an entire directory.
 */
public class MultipleFileUploadImpl extends MultipleFileTransfer implements MultipleFileUpload {

    private final String keyPrefix;
    private final String bucketName;
    
    public MultipleFileUploadImpl(String description, TransferProgress transferProgress,
            ProgressListenerChain progressListenerChain, String keyPrefix, String bucketName, Collection<? extends Upload> subTransfers) {
        super(description, transferProgress, progressListenerChain, subTransfers);
        this.keyPrefix = keyPrefix;
        this.bucketName = bucketName;
    }

    /**
     * Returns the key prefix of the virtual directory being uploaded to.
     */
    public String getKeyPrefix() {
        return keyPrefix;
    }
    
    /**
     * Returns the name of the bucket to which files are uploaded.
     */
    public String getBucketName() {
        return bucketName;
    }
}
