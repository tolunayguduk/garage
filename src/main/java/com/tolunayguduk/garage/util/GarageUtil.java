package com.tolunayguduk.garage.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.tolunayguduk.garage.enums.ColorEnum;
import com.tolunayguduk.garage.enums.VehicleTypeEnum;
import com.tolunayguduk.garage.model.Car;
import com.tolunayguduk.garage.model.Garage;
import com.tolunayguduk.garage.model.Jeep;
import com.tolunayguduk.garage.model.Ticket;
import com.tolunayguduk.garage.model.Truck;
import com.tolunayguduk.garage.model.Vehicle;

import com.tolunayguduk.garage.exception.Exception;

@Service
@Scope("application")
public class GarageUtil {

	private List<Ticket> tickets = new ArrayList<>();
	private Garage<Vehicle> garage = new Garage<>();
	private int ticketID = 0;

	public Ticket park(String plate, ColorEnum color, VehicleTypeEnum vehicleType) {
		Vehicle vehicle = getVehicle(vehicleType, plate);
		Ticket ticket = new Ticket(ticketID, vehicle, color, emplaceVehicle(vehicleType, plate));
		ticketID++;
		tickets.add(ticket);
		garage.push(vehicle);
		return ticket;
	}

	public Ticket leave(long ticketId) {
		List<Ticket> list = tickets.stream().filter(ticket -> ticket.getId() == ticketId).collect(Collectors.toList());
		Ticket ticket;
		if (list.size() < 1) {
			throw Exception.TICKET_NOT_FOUND.raise();
		} else {
			ticket = list.get(0);
			tickets.removeIf(x -> x.getId() == ticket.getId());
			garage.pop(getVehicle(ticket.getVehicle().getVehicleType(), ticket.getVehicle().getPlate()));
			garage.clearSlots(ticket.getSlots());
		}

		return ticket;
	}

	public List<Ticket> status() {
		return Collections.unmodifiableList(tickets);
	}

	private int[] emplaceVehicle(VehicleTypeEnum vehicleType, String plate) {
		return garage.findAvailableSlots(getVehicle(vehicleType, ""));
	}

	private Vehicle getVehicle(VehicleTypeEnum vehicleType, String plate) {
		if (vehicleType == VehicleTypeEnum.CAR) {
			return new Car(plate);
		} else if (vehicleType == VehicleTypeEnum.JEEP) {
			return new Jeep(plate);
		} else if (vehicleType == VehicleTypeEnum.TRUCK) {
			return new Truck(plate);
		} else {
			return null;
		}
	}
}
