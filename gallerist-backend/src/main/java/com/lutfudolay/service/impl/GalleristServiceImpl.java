package com.lutfudolay.service.impl;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lutfudolay.dto.DtoAddress;
import com.lutfudolay.dto.DtoGallerist;
import com.lutfudolay.dto.DtoGalleristIU;
import com.lutfudolay.exception.BaseException;
import com.lutfudolay.exception.ErrorMessage;
import com.lutfudolay.exception.MessageType;
import com.lutfudolay.model.Address;
import com.lutfudolay.model.Gallerist;
import com.lutfudolay.repository.AddressRepository;
import com.lutfudolay.repository.GalleristRepository;
import com.lutfudolay.service.IGalleristService;

@Service
public class GalleristServiceImpl implements IGalleristService{

	@Autowired
	private GalleristRepository galleristRepository;
	
	@Autowired
	private AddressRepository addressRepository;

	private Gallerist createGallerist(DtoGalleristIU dtoGalleristIU) {
		
		Optional<Address> optAddress = addressRepository.findById(dtoGalleristIU.getAddressId());
		if (optAddress.isEmpty()) {
			throw new BaseException(new ErrorMessage(MessageType.NO_RECORD_EXİST,dtoGalleristIU.getAddressId().toString()));
		}
		
		Gallerist gallerist = new Gallerist();
		gallerist.setCreatetime(new Date());
		
		BeanUtils.copyProperties(dtoGalleristIU, gallerist);
		gallerist.setAddress(optAddress.get());
		
		return gallerist;
	}
	
	@Override
	public DtoGallerist saveGallerist(DtoGalleristIU dtoGalleristIU) {
		DtoGallerist dtoGallerist = new DtoGallerist();
		DtoAddress dtoAddress = new DtoAddress();
		
		Gallerist savedGallerist = galleristRepository.save(createGallerist(dtoGalleristIU));
		
		BeanUtils.copyProperties(savedGallerist, dtoGallerist);
		BeanUtils.copyProperties(savedGallerist.getAddress(),dtoAddress);
		
		dtoGallerist.setAddress(dtoAddress);
		
		return dtoGallerist;
	}
}
