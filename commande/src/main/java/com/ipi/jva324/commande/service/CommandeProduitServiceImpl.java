package com.ipi.jva324.commande.service;

import com.ipi.jva324.stock.model.ProduitEnStock;
import com.ipi.jva324.stock.repository.ProduitEnStockRepository;
import com.ipi.jva324.stock.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CommandeProduitServiceImpl implements CommandeProduitService {

    @Autowired
    public ProduitService produitService;

    @Override
    public ProduitEnStock getProduit(Long produitid) {
        return produitService.getProduit(produitid);
    }
}
