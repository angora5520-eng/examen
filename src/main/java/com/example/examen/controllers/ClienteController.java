package com.example.examen.controllers;

import com.example.examen.models.Cliente;
import com.example.examen.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/clientes")
@CrossOrigin(origins = "*")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public List<Cliente> listar() { return clienteService.listarTodos(); }

    @PostMapping
    public Cliente crear(@RequestBody Cliente cliente) { return clienteService.guardar(cliente); }
}