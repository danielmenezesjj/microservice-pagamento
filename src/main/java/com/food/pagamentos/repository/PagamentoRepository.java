package com.food.pagamentos.repository;

import com.food.pagamentos.model.Pagamento;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.domain.Pageable;

public interface PagamentoRepository extends JpaRepository<Pagamento, Long> {
    Page<Pagamento> findAll(Pageable paginacao);
}
