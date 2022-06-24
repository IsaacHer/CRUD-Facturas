package com.app.web;

import com.app.web.Entity.FacturaEntity;
import com.app.web.Repository.FacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudFacturasApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CrudFacturasApplication.class, args);
	}

    
        @Autowired
        private FacturaRepository facturaRepository;
    @Override
    public void run(String... args) throws Exception {
        /*
        FacturaEntity factura1 = new FacturaEntity("Johan Hernandez", "125636");
        facturaRepository.save(factura1);
        
        FacturaEntity factura2 = new FacturaEntity("Sofia Carreño", "5632");
        facturaRepository.save(factura2);
        */
    }

}
