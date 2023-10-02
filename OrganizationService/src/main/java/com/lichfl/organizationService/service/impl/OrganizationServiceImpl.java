package com.lichfl.organizationService.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.lichfl.organizationService.dto.OrganizationDto;
import com.lichfl.organizationService.entity.Organization;
import com.lichfl.organizationService.repository.OrganizationRepository;
import com.lichfl.organizationService.service.OrganizationService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class OrganizationServiceImpl implements OrganizationService {

	OrganizationRepository organizationRepository;

	@Override
	public OrganizationDto saveOrganization(OrganizationDto organizationDto) {

		Organization organization = new Organization();
		BeanUtils.copyProperties(organizationDto, organization);

		Organization savedOrganization = organizationRepository.save(organization);
		OrganizationDto savedOrganizationDto = new OrganizationDto();
		BeanUtils.copyProperties(savedOrganization, savedOrganizationDto);
		return savedOrganizationDto;
	}

	@Override
	public OrganizationDto getOrganizationBYCode(String organizationCode) {
		Organization organization = organizationRepository.findByOrganizationCode(organizationCode);

		OrganizationDto organizationDto = new OrganizationDto();
		BeanUtils.copyProperties(organization, organizationDto);
		return organizationDto;
	}

}
