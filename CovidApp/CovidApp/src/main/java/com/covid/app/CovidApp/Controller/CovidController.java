package com.covid.app.CovidApp.Controller;

import com.covid.app.CovidApp.Service.CovidDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/covid-data")
public class CovidController {

@Autowired
    CovidDataService covidDataService ;

    //localhost:8080/covid-data/citywise/delhi
@GetMapping("/city-wise/{city}")
    public Integer getCovidCases(@PathVariable String city)
{
    Integer CovidData=covidDataService.getCovidData(city);
    return 0;
    }
}
