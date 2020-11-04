
package com.limaprojects.apiprodutos.resource;

import com.limaprojects.apiprodutos.domain.Produto;
import com.limaprojects.apiprodutos.repository.ProdutoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produtos")
public class ProdutoResource {
    
    @Autowired
    private ProdutoRepository produtoRepository;
    
    @PostMapping
    public void createProduto(Produto produto){
        produtoRepository.save(produto);
    }
    
    @GetMapping
    public List<Produto> readAllprodutos(){
        return produtoRepository.findAll();
    }
    
    @GetMapping("/produto")
    public Produto readOneProduto(long id){
        return produtoRepository.findById(id);
    }
    
    @PutMapping
    public void updateProduto(Produto produto){
        produtoRepository.save(produto);
    }
    
    @DeleteMapping
    public void deleteProduto(long id){
        produtoRepository.deleteById(id);
    }
    
}
