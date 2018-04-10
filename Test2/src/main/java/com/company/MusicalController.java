package com.company;

import java.util.Collection;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/musicalIntruments")
public class MusicalController {

	private static MusicService musManager = new MusicService();


	@GET
	@Path("/")
	@Produces(MediaType.APPLICATION_JSON)
	public Collection<MusicalInstrument> getAll() {
		return musManager.getAll();
	}
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public MusicalInstrument get( @PathParam("id") Integer id) {
		return musManager.get(id);
	}

	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	public MusicalInstrument create(MusicalInstrument instrument) {
		return musManager.update(instrument.getId(), instrument);
	}

	@POST
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public MusicalInstrument update(@PathParam("id") Integer id, MusicalInstrument instrument) {
		//musManager.getMap().put(id, instrument);
		return musManager.create(instrument);
	}

	@DELETE
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
	public void delate( @PathParam ("id") Integer id) {
		musManager.delate(id);
	}

}
