package com.fullstack.core;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BestEx {
	public static void main(String[] args) {
		Map<Type, Integer> o = TaxData.data.stream()
				.collect(Collectors.groupingBy(TaxData::getCity, Collectors.summingInt(TaxData::getTax)));
		System.out.println("\n CITY TAX HERE:");

		// System.out.println(o);
		o.forEach((k, v) -> {
			System.out.println(k + ": " + v);
		});

	}
}

enum Type {
	PUNE, MUMBAI, OTHER
}

class TaxData {

	private final String stateName;
	private final int cityId;
	private final int tax;
	private final Type city;

	public TaxData(String stateName, int cityId, int tax, Type city) {
		super();
		this.stateName = stateName;
		this.cityId = cityId;
		this.tax = tax;
		this.city = city;
	}

	public String getStateName() {
		return stateName;
	}

	public int isCityId() {
		return cityId;
	}

	public int getTax() {
		return tax;
	}

	public Type getCity() {
		return city;
	}

	public static List<TaxData> getData() {
		return data;
	}

	@Override
	public String toString() {
		return stateName;
	}

	public static List<TaxData> data = (List<TaxData>) Arrays.asList(new TaxData("MAHARASTRA", 101, 8, Type.PUNE),
			new TaxData("MAHARASTRA", 102, 8, Type.MUMBAI), new TaxData("MAHARASTRA", 103, 8, Type.PUNE),
			new TaxData("GOA", 104, 8, Type.OTHER), new TaxData("SIKKIM", 105, 8, Type.OTHER),
			new TaxData("MAHARASTRA ", 106, 8, Type.OTHER), new TaxData("UTTARAKHAND", 107, 8, Type.OTHER),
			new TaxData("MAHARASTRA", 108, 8, Type.PUNE), new TaxData("MAHARASTRA", 109, 8, Type.MUMBAI),
			new TaxData("KREAL", 110, 8, Type.OTHER));

}
