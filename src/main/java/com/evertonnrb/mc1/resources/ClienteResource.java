package com.evertonnrb.mc1.resources;

import ch.qos.logback.core.net.server.Client;
import com.evertonnrb.mc1.domain.Cliente;
import com.evertonnrb.mc1.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/clientes")
public class ClienteResource {

    @Autowired
    private ClienteService service;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> find(@PathVariable Integer id){
        Cliente cliente = service.buscar(id);
        return ResponseEntity.ok().body(cliente);
    }
}
