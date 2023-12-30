package com.kn.Practice;

public class Car implements Comparable<Car>
{
	String name;
	double prize;
	int seatCapacity;
	public Car(String name, double prize, int seatCapacity) {
		this.name = name;
		this.prize = prize;
		this.seatCapacity = seatCapacity;
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", prize=" + prize + ", seatCapacity=" + seatCapacity + "]";
	}
	@Override
	public int compareTo(Car o)
	{
		if(this.prize<o.prize) {
			return 1;
		}
		else if(this.prize>o.prize)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
	
}
