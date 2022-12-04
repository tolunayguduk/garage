package com.tolunayguduk.garage.model;

import java.util.ArrayList;
import java.util.List;

import com.tolunayguduk.garage.exception.Exception;

public class Garage<T extends Vehicle> {

	private List<T> vehicles = new ArrayList<>();
	private List<Slot> slots = new ArrayList<Slot>();
	private final int capacity = 10;

	public Garage() {
		for (int i = 0; i < capacity; i++) {
			slots.add(new Slot(i, true));
		}
	}

	public void push(T vehicle) {
		vehicles.add(vehicle);
	}

	public void pop(T vehicle) {
		vehicles.remove(vehicle);
	}

	public int[] findAvailableSlots(Vehicle vehicle) {
		List<Integer> tmpSlots = new ArrayList<>();
		for (int i = 0; i < slots.size(); i++) {
			boolean fit = true;
			if (slots.get(i).isAvailable()) {

				for (int j = i; j < i + vehicle.getHold(); j++) {
					if (j >= capacity || !slots.get(j).isAvailable()) {
						fit = false;
					}
				}
				if (fit) {
					if(((i == 0) ? true : slots.get(i -1).isAvailable()) && ((i + vehicle.getHold() == capacity-1) ? true : slots.get(i +1).isAvailable())) {
						for (int k = i; k < i + vehicle.getHold(); k++) {
							slots.get(k).setAvailable(false);
							tmpSlots.add(k);
						}
						return tmpSlots.stream().mapToInt(Integer::intValue).toArray();
					}
				}
			}
		}
		throw Exception.FULL_CAPACITY.raise();
	}

	public void clearSlots(int[] parkedSlots) {
		for (int i = 0; i < parkedSlots.length; i++) {
			for (int j = 0; j < slots.size(); j++) {
				if (parkedSlots[i] == j) {
					slots.get(j).setAvailable(true);
				}
			}
		}
	}

}
