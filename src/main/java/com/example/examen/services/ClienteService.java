package com.example.examen.services;

import com.example.examen.models.Cliente;
import com.example.examen.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> listarTodos() { return clienteRepository.findAll(); }
    public Cliente guardar(Cliente cliente) { return clienteRepository.save(cliente); }
}