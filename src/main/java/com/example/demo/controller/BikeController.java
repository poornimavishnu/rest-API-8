package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Bike;
import com.example.demo.Service.ApiService;
@RestController
public class BikeController {
	@Autowired
	ApiService bs;
	
	@PostMapping("/")
	public List<Bike> addBike(@RequestBody List<Bike> b)
	{
		return bs.post(b);
	}
	@GetMapping("/")
	public List<Bike> getBike(@RequestBody List<Bike> b)
	{
		return bs.post(b);
	}
	@GetMapping("/year/{year}")
	public List<Bike> showByYear(@PathVariable int year)
	{
		return bs.getByYear(year);
	}
	
	@GetMapping("/year/{year}/bikeName/{bikeName}")
	public List<Bike> showByYearName(@PathVariable int year,@PathVariable String bikeName)
	{
		return bs.getByNameYear(year, bikeName);
	}
	
	@GetMapping("/bikeName/{bikeName}")
	public List<Bike> showName(@PathVariable String bikeName)
	{
		return bs.getByName(bikeName);
	}
}
