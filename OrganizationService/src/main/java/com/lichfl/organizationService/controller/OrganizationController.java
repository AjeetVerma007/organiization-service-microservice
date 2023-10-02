package com.lichfl.organizationService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lichfl.organizationService.dto.OrganizationDto;
import com.lichfl.organizationService.service.OrganizationService;

@RestController
@RequestMapping("api/organizations")
public class OrganizationController {

	@Autowired
	private OrganizationService organizationService;

	@PostMapping
	public ResponseEntity<OrganizationDto> saveOrganization(@RequestBody OrganizationDto organizationDto) {
		OrganizationDto saveOrganization = organizationService.saveOrganization(organizationDto);

		return new ResponseEntity<OrganizationDto>(saveOrganization, HttpStatus.CREATED);

	}

	@GetMapping("{code}")
	public ResponseEntity<OrganizationDto> getOrganizationByCode(@PathVariable("code") String oganizationCode) {
		OrganizationDto organizationDto = organizationService.getOrganizationBYCode(oganizationCode);
		return new ResponseEntity<OrganizationDto>(organizationDto, HttpStatus.OK);

	}

}
