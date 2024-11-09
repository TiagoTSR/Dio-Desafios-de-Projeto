package br.com.xdecodex.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.xdecodex.model.Fornecedor;
import br.com.xdecodex.repository.FornecedorRepository;

@Service
public class FornecedorService {

    @Autowired
    private FornecedorRepository fornecedorRepository;

    public Fornecedor salvarFornecedor(Fornecedor fornecedor) {
        return fornecedorRepository.save(fornecedor);
    }

    public List<Fornecedor> listarFornecedores() {
        return fornecedorRepository.findAll();
    }

    public Optional<Fornecedor> obterFornecedor(Long id) {
        return fornecedorRepository.findById(id);
    }

    public Fornecedor atualizarFornecedor(Long id, Fornecedor fornecedor) {
        if (fornecedorRepository.existsById(id)) {
            fornecedor.setId(id);
            return fornecedorRepository.save(fornecedor);
        }
        return null;
    }

    public boolean deletarFornecedor(Long id) {
        if (fornecedorRepository.existsById(id)) {
            fornecedorRepository.deleteById(id);
            return true;
        }
        return false;
    }
}