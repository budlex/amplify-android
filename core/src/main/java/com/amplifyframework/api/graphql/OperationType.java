/*
 * Copyright 2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amplifyframework.api.graphql;

/**
 * Represents a GraphQL operation.
 */
public enum OperationType {
    /**
     * GraphQL query operation.
     */
    QUERY("query"),

    /**
     * GraphQL mutation operation.
     */
    MUTATION("mutation"),

    /**
     * GraphQL subscription operation.
     */
    SUBSCRIPTION("subscription");

    private final String name;

    OperationType(String name) {
        this.name = name;
    }

    /**
     * Returns the name of the operation.
     * @return the name of the operation.
     */
    public String getName() {
        return name;
    }
}
