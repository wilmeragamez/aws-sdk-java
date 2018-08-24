/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeCollectionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String collectionId;

    /**
     * @param collectionId
     */

    public void setCollectionId(String collectionId) {
        this.collectionId = collectionId;
    }

    /**
     * @return
     */

    public String getCollectionId() {
        return this.collectionId;
    }

    /**
     * @param collectionId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCollectionRequest withCollectionId(String collectionId) {
        setCollectionId(collectionId);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCollectionId() != null)
            sb.append("CollectionId: ").append(getCollectionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeCollectionRequest == false)
            return false;
        DescribeCollectionRequest other = (DescribeCollectionRequest) obj;
        if (other.getCollectionId() == null ^ this.getCollectionId() == null)
            return false;
        if (other.getCollectionId() != null && other.getCollectionId().equals(this.getCollectionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCollectionId() == null) ? 0 : getCollectionId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeCollectionRequest clone() {
        return (DescribeCollectionRequest) super.clone();
    }

}
