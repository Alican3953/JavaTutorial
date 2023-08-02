package com.Okuls.navbilgis.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ASinifiniClasi aSinifiniClasi = new ASinifiniClasi();
		System.out.println(aSinifiniClasi.asınıfısınavnotları());
		SpringApplication.run(DemoApplication.class, args);
	}

}
