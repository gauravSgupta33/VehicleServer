package com.gaurav.controller;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.Response;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gaurav.model.Vehicle;

@CrossOrigin
@RestController
public class VehicleController {

	@RequestMapping(value = "/getVehicleDetails", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	//@RequestMapping("/getVehicleDetails")
	public List<Vehicle> getVehicleDetails() {
		List<Vehicle> vehicleList = new ArrayList<Vehicle>();
		Vehicle v1 = new Vehicle();
		v1.setId("1");
		v1.setMass("40");
		v1.setName("An-2");
		v1.setType("Truck");
		
		Vehicle v2 = new Vehicle();
		v2.setId("2");
		v2.setMass("50");
		v2.setName("LandCruiser-2");
		v2.setType("Jeep");

		Vehicle v3 = new Vehicle();
		v3.setId("3");
		v3.setMass("40");
		v3.setName("Trailer-1");
		v3.setType("Truck");

		vehicleList.add(v1);
		vehicleList.add(v2);
		vehicleList.add(v3);
		
//		return (List<Vehicle>) Response.ok().entity(new GenericEntity<List<Vehicle>>(vehicleList) {})
//        .header("Access-Control-Allow-Origin", "*")
//        .header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT, OPTIONS, HEAD")
//        .build();
		return vehicleList;
	}
}
