package br.com.carsDao.api.Resources;

import br.com.carsDao.api.Services.CarsService;
import lombok.AllArgsConstructor;

import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/cars")
@Produces(value = MediaType.APPLICATION_JSON)
@Consumes(value = MediaType.APPLICATION_JSON)
@AllArgsConstructor
public class CarsController {

    private final CarsService carsService;

}
