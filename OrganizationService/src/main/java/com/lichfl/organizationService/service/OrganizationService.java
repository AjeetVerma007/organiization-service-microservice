package com.lichfl.organizationService.service;

import com.lichfl.organizationService.dto.OrganizationDto;

public interface OrganizationService {

	public OrganizationDto saveOrganization(OrganizationDto organizationDto);

	public OrganizationDto getOrganizationBYCode(String organizationCode);

}
