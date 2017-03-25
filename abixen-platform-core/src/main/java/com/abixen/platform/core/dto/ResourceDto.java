/**
 * Copyright (c) 2010-present Abixen Systems. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.abixen.platform.core.dto;


import com.abixen.platform.common.model.enumtype.ResourcePage;
import com.abixen.platform.common.model.enumtype.ResourcePageLocation;
import com.abixen.platform.common.model.enumtype.ResourceType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
@ToString
public class ResourceDto extends AuditingDto {

    private Long id;
    private String relativeUrl;
    private ResourcePageLocation resourcePageLocation;
    private ResourcePage resourcePage;
    private ResourceType resourceType;
    private ModuleTypeDto moduleType;
}