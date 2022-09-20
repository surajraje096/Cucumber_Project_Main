package com.orangeHRM.TestRunner;

import java.io.File;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\SpringBoot API Projects\\OrangeHRM\\src\\main\\java\\com\\orangeHRM\\Feature\\login.feature"
,glue={"com.orangeHRM.StepDefination"},
	monochrome=true,
	plugin = { "pretty" }

	
	
	
	)


public class MyRunner {
	
	
	
}
