package com.lutfudolay.service.impl;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lutfudolay.dto.DtoAddress;
import com.lutfudolay.dto.DtoCar;
import com.lutfudolay.dto.DtoGallerist;
import com.lutfudolay.dto.DtoGalleristCar;
import com.lutfudolay.dto.DtoGalleristCarIU;
import com.lutfudolay.exception.BaseException;
import com.lutfudolay.exception.ErrorMessage;
import com.lutfudolay.exception.MessageType;
import com.lutfudolay.model.Car;
import com.lutfudolay.model.Gallerist;
import com.lutfudolay.model.GalleristCar;
import com.lutfudolay.repository.CarRepository;
import com.lutfudolay.repository.GalleristCarRepository;
import com.lutfudolay.repository.GalleristRepository;
import com.lutfudolay.service.IGalleristCarService;

@Service
public class GalleristCarServiceImpl implements IGalleristCarService{
	
	@Autowired
	private GalleristCarRepository galleristCarRepository;
	
	@Autowired
	private GalleristRepository galleristRepository;
	
	@Autowired
	private CarRepository carRepository;
	
	private GalleristCar createGalleristCar(DtoGalleristCarIU dtoGalleristCarIU) {
		
		Optional<Gallerist> optGallerist = galleristRepository.findById(dtoGalleristCarIU.getGalleristId());
		if (optGallerist.isEmpty()) {
			throw new BaseException(new ErrorMessage(MessageType.NO_RECORD_EXİST, dtoGalleristCarIU.getGalleristId().toString()));
		}
		
		Optional<Car> optCar = carRepository.findById(dtoGalleristCarIU.getCarId());
		if (optCar.isEmpty()) {
			
			throw new BaseException(new ErrorMessage(MessageType.NO_RECORD_EXİST,dtoGalleristCarIU.getCarId().toString()));
		}
		
		GalleristCar galleristCar = new GalleristCar();
		galleristCar.setCreatetime(new Date());
		galleristCar.setGallerist(optGallerist.get());
		galleristCar.setCar(optCar.get());
		
		BeanUtils.copyProperties(dtoGalleristCarIU, galleristCar);
		
		return galleristCar;
	}
	
	@Override
	public DtoGalleristCar saveGalleristCar(DtoGalleristCarIU dtoGalleristCarIU) {
		
		DtoGalleristCar dtoGalleristCar = new DtoGalleristCar();
		DtoGallerist dtoGallerist = new DtoGallerist();
		DtoCar dtoCar = new DtoCar();
		
		DtoAddress dtoAddress = new DtoAddress();
		
		GalleristCar savedGalleristCar = galleristCarRepository.save(createGalleristCar(dtoGalleristCarIU));

		
		BeanUtils.copyProperties(savedGalleristCar, dtoGalleristCar);
		BeanUtils.copyProperties(savedGalleristCar.getGallerist(), dtoGallerist);
		BeanUtils.copyProperties(savedGalleristCar.getGallerist().getAddress(), dtoAddress);
		BeanUtils.copyProperties(savedGalleristCar.getCar(), dtoCar);
		
		dtoGallerist.setAddress(dtoAddress);
		dtoGalleristCar.setGallerist(dtoGallerist);
		dtoGalleristCar.setCar(dtoCar);
		
		return dtoGalleristCar;
	}

}
