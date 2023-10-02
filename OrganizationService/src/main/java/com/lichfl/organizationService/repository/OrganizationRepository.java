package com.lichfl.organizationService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lichfl.organizationService.entity.Organization;

public interface OrganizationRepository extends JpaRepository<Organization, Long> {

	Organization findByOrganizationCode(String organizationCode);
}
