package com.lutfudolay.service.impl;

import java.util.Date;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lutfudolay.dto.DtoCar;
import com.lutfudolay.dto.DtoCarIU;
import com.lutfudolay.model.Car;
import com.lutfudolay.repository.CarRepository;

@Service
public class CarServiceImpl implements ICarService{

	@Autowired
	private CarRepository carRepository;
	
	private Car createCar(DtoCarIU dtoCarIU) {
		Car car = new Car();
		car.setCreatetime(new Date());
		
		BeanUtils.copyProperties(dtoCarIU, car);
		return car;
	}
	
	@Override
	public DtoCar savedCar(DtoCarIU dtoCarIU) {
		DtoCar dtoCar = new DtoCar();
		
		Car savedCar = carRepository.save(createCar(dtoCarIU));
		BeanUtils.copyProperties(savedCar, dtoCar);
		
		return dtoCar;
	}

}
